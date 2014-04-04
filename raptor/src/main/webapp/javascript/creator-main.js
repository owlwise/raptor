function main($scope) {
	$scope.metaTypes = [
		{
			name:'Dwarf',
			bpCost:25,
			bod:'1',
			agi:'0',
			rea:'0',
			str:'2',
			cha:'0',
			int:'0',
			log:'0',
			wil:'1'
		},
		{
			name:'Elf',
			bpCost:30,
			bod:'0',
			agi:'1',
			rea:'0',
			str:'0',
			cha:'2',
			int:'0',
			log:'0',
			wil:'0'
		},
		{
			name:'Human',
			bpCost:0,
			bod:'0',
			agi:'0',
			rea:'0',
			str:'0',
			cha:'0',
			int:'0',
			log:'0',
			wil:'0'
		},
		{
			name:'Ork',
			bpCost:20,
			bod:'3',
			agi:'0',
			rea:'0',
			str:'2',
			cha:'0',
			int:'0',
			log:'0',
			wil:'0'
		},
		{	name:'Troll',
			bpCost:40,
			bod:'4',
			agi:'0',
			rea:'0',
			str:'4',
			cha:'0',
			int:'0',
			log:'0',
			wil:'0'
		}
		];
	$scope.generateCharacter = function () {
		$scope.showGenerator = true;
		$scope.step1 = {};
		$scope.step1.active = true;
		$scope.step2 = {};
		$scope.step3 = {};
		$scope.step4 = {};
		$scope.step5 = {};
		$scope.step6 = {};
		$scope.currentStep = 1;
		$scope.character = {};
		$scope.bp = 400;
			
	}
	$scope.next = function () {
		$scope.error = '';
		if ($scope.currentStep !== 6) {
			if ($scope.character.metaType) {
				$scope.currentStep++;
			} else {
				$scope.error = 'Select a metatype before continuing.';
			}
			
			switch($scope.currentStep) 
			{
				case 2:
					$scope.step1.active = false;
					$scope.step2.active = true;
					$scope.character.qualities = [];
					$scope.positiveQualities = [
						{description:'Adept',cost:5,type:1},
						{description:'Animal Empathy',cost:10,type:1},
						{description:'Magician',cost:15,type:1}
					];
					$scope.negativeQualities = [
						{description:'Astral Beacon',cost:5,type:0},
						{description:'Bad Luck',cost:20,type:0},
						{description:'Spirit Bane',cost:15,type:0}
					];
				break;
				case 3:
					$scope.step2.active = false;
					$scope.step3.active = true;
					$scope.bpSpentOnAttr = 0;
					if ($scope.character.metaType.name === 'Dwarf') {
						$scope.character.attributes = [{description:'BOD',value:2,minValue:2,maxValue:7},{description:'AGI',value:1,minValue:1,maxValue:6},{description:'REA',value:1,minValue:1,maxValue:5},{description:'STR',value:3,minValue:3,maxValue:8},{description:'CHA',value:1,minValue:1,maxValue:6},{description:'INT',value:1,minValue:1,maxValue:6},{description:'LOG',value:1,minValue:1,maxValue:6},{description:'WIL',value:2,minValue:2,maxValue:7}];
					}
					else if ($scope.character.metaType.name === 'Elf') {
						$scope.character.attributes = [{description:'BOD',value:1,minValue:1,maxValue:6},{description:'AGI',value:2,minValue:2,maxValue:7},{description:'REA',value:1,minValue:1,maxValue:6},{description:'STR',value:1,minValue:1,maxValue:6},{description:'CHA',value:3,minValue:3,maxValue:8},{description:'INT',value:1,minValue:1,maxValue:6},{description:'LOG',value:1,minValue:1,maxValue:6},{description:'WIL',value:1,minValue:1,maxValue:6}];
					}
					else if ($scope.character.metaType.name === 'Human') {
						$scope.character.attributes = [{description:'BOD',value:1,minValue:1,maxValue:6},{description:'AGI',value:1,minValue:1,maxValue:6},{description:'REA',value:1,minValue:1,maxValue:6},{description:'STR',value:1,minValue:1,maxValue:6},{description:'CHA',value:1,minValue:1,maxValue:6},{description:'INT',value:1,minValue:1,maxValue:6},{description:'LOG',value:1,minValue:1,maxValue:6},{description:'WIL',value:1,minValue:1,maxValue:6}];
					}
					else if ($scope.character.metaType.name === 'Ork') {
						$scope.character.attributes = [{description:'BOD',value:4,minValue:4,maxValue:9},{description:'AGI',value:1,minValue:1,maxValue:6},{description:'REA',value:1,minValue:1,maxValue:6},{description:'STR',value:3,minValue:3,maxValue:8},{description:'CHA',value:1,minValue:1,maxValue:5},{description:'INT',value:1,minValue:1,maxValue:6},{description:'LOG',value:1,minValue:1,maxValue:5},{description:'WIL',value:1,minValue:1,maxValue:6}];
					}
					else if ($scope.character.metaType.name === 'Troll') {
						$scope.character.attributes = [{description:'BOD',value:5,minValue:5,maxValue:10},{description:'AGI',value:1,minValue:1,maxValue:5},{description:'REA',value:1,minValue:1,maxValue:6},{description:'STR',value:5,minValue:5,maxValue:10},{description:'CHA',value:1,minValue:1,maxValue:4},{description:'INT',value:1,minValue:1,maxValue:5},{description:'LOG',value:1,minValue:1,maxValue:5},{description:'WIL',value:1,minValue:1,maxValue:6}];
					}
				break;
				case 4:
					$scope.step3.active = false;
					$scope.step4.active = true;
				break;
				case 5:
					$scope.step4.active = false;
					$scope.step5.active = true;
				break;
				case 6:
					$scope.step5.active = false;
					$scope.step6.active = true;
				break;
			}
		}
	}
	$scope.previous = function() {
			$scope.error = '';
			$scope.currentStep--;
			switch($scope.currentStep) 
			{
				case 0:
					$scope.showGenerator = false;
					$scope.character.metaType = {};
				case 1:
					$scope.step1.active = true;
					$scope.step2.active = false;
				break;
				case 2:
					$scope.step2.active = true;
					$scope.step3.active = false;
					$scope.character.attributes = [];
					$scope.bp = $scope.bp + $scope.bpSpentOnAttr;
				break;
				case 3:
					$scope.step3.active = true;
					$scope.step4.active = false;
				break;
				case 4:
					$scope.step4.active = true;
					$scope.step5.active = false;
				break;
				case 5:
					$scope.step5.active = true;
					$scope.step6.active = false;
				break;
			}
	}
	$scope.selectMetaType = function (metaType) {
		$scope.character.metaType = metaType;
		$scope.bp = 400 - metaType.bpCost;
	}
	$scope.addAttr = function(attribute) {
		$scope.error = '';
		if(attribute.value < attribute.maxValue) {
			attribute.value++;
			if (attribute.value === attribute.maxValue) {
				$scope.bp = $scope.bp - 25;
				$scope.bpSpentOnAttr = $scope.bpSpentOnAttr + 25;
			} else {
				$scope.bp = $scope.bp - 10;
				$scope.bpSpentOnAttr = $scope.bpSpentOnAttr + 10;
			}
		} else {
			$scope.error = attribute.description + ' Maximum: ' + attribute.maxValue + '.';  
		}
	}
	$scope.subtractAttr = function (attribute) {
		$scope.error = '';
		if(attribute.value > attribute.minValue) {
			if (attribute.value === attribute.maxValue) {
				$scope.bp = $scope.bp + 25;
				$scope.bpSpentOnAttr = $scope.bpSpentOnAttr - 25;
			} else {
				$scope.bp = $scope.bp + 10;
				$scope.bpSpentOnAttr = $scope.bpSpentOnAttr - 25;
			}
			attribute.value--;
		} else {
			$scope.error = attribute.description + ' Minimum:' + attribute.minValue + '.';
		}
	}
	$scope.removeQuality = function (quality,index) {
		$scope.character.qualities.splice(index,1);
		if(quality.type === 1) {
			$scope.positiveQualities.push(quality);
			$scope.bp = $scope.bp + quality.cost;
		} 
		else if (quality.type === 0) {
			$scope.negativeQualities.push(quality);
			$scope.bp = $scope.bp - quality.cost;			
		}
	}
	$scope.addQuality = function (quality,index) {
		$scope.character.qualities.push(quality);
		if(quality.type === 1) {
			$scope.positiveQualities.splice(quality,1);
			$scope.bp = $scope.bp - quality.cost;
		} 
		else if (quality.type === 0) {
			$scope.negativeQualities.splice(quality,1);
			$scope.bp = $scope.bp + quality.cost;			
		}
		
	}
}