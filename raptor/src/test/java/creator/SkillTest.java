package creator;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class SkillTest
{
  public static Skill getPistolSkill()
  {
    Skill pistolSkill = new Skill();
    
    pistolSkill.setCost(24);;
    pistolSkill.setName("Pistol");
    pistolSkill.setGroup(SkillGroup.FIREARMS);
    pistolSkill.setRank(6);
    pistolSkill.setType(Type.ACTIVE);
    
    return pistolSkill;
  }
  public static Skill getAutomaticsSkill()
  {
    Skill automatics = new Skill();
    
    automatics.setCost(16);;
    automatics.setName("Automatics");
    automatics.setGroup(SkillGroup.FIREARMS);
    automatics.setRank(4);
    automatics.setType(Type.ACTIVE);
    
    return automatics;
  }
  public static Skill getDodgeSkill()
  {
    Skill dodge = new Skill();
    
    dodge.setCost(16);;
    dodge.setName("Dodge");
    dodge.setGroup(SkillGroup.NONE);
    dodge.setRank(4);
    dodge.setType(Type.ACTIVE);
    
    return dodge;
  }
  public static Skill getLongArmsSkill()
  {
    Skill longArms = new Skill();
    
    longArms.setCost(12);;
    longArms.setName("Long Arms");
    longArms.setGroup(SkillGroup.FIREARMS);
    longArms.setRank(3);
    longArms.setType(Type.ACTIVE);
    
    return longArms;
  }
  public static Skill getHeavyWeaponsSkill()
  {
    Skill heavyWeapons = new Skill();
    
    heavyWeapons.setCost(8);;
    heavyWeapons.setName("Heavy Weapons");
    heavyWeapons.setGroup(SkillGroup.FIREARMS);
    heavyWeapons.setRank(2);
    heavyWeapons.setType(Type.ACTIVE);
    
    return heavyWeapons;
  }
  public static Skill getThrownWeaponsSkill()
  {
    Skill thrownWeapons = new Skill();
    
    thrownWeapons.setCost(8);;
    thrownWeapons.setName("Thrown Weapons");
    thrownWeapons.setGroup(SkillGroup.NONE);
    thrownWeapons.setRank(2);
    thrownWeapons.setType(Type.ACTIVE);
    
    return thrownWeapons;
  }
  public static Skill getNegotiationSkill()
  {
    Skill negotiation = new Skill();
    
    negotiation.setCost(8);;
    negotiation.setName("Negotiation");
    negotiation.setGroup(SkillGroup.INFLUENCE);
    negotiation.setRank(2);
    negotiation.setType(Type.ACTIVE);
    
    return negotiation;
  }
  public static Skill getInfiltrationSkill()
  {
    Skill infiltration = new Skill();
    
    infiltration.setCost(8);;
    infiltration.setName("Infiltration");
    infiltration.setGroup(SkillGroup.STEALTH);
    infiltration.setRank(2);
    infiltration.setType(Type.ACTIVE);
    
    return infiltration;
  }
  public static Skill getArmorerSkill()
  {
    Skill armourer = new Skill();
    
    armourer.setCost(8);;
    armourer.setName("Armorer");
    armourer.setGroup(SkillGroup.NONE);
    armourer.setRank(2);
    armourer.setType(Type.ACTIVE);
    
    return armourer;
  }
  public static Skill getPeceptionSkill()
  {
    Skill perception = new Skill();
    
    perception.setCost(16);;
    perception.setName("Perception");
    perception.setGroup(SkillGroup.NONE);
    perception.setRank(4);
    perception.setType(Type.ACTIVE);
    
    return perception;
  }
  public static Skill getEtiquetteSkill()
  {
    Skill etiquette = new Skill();
    
    etiquette.setCost(4);;
    etiquette.setName("Etiquette - Military specialization");
    etiquette.setGroup(SkillGroup.INFLUENCE);
    etiquette.setRank(2);
    etiquette.setType(Type.ACTIVE);
    
    return etiquette;
  }
  

  @Test
  public final void testType()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Type should be Active",Type.ACTIVE,testSkill.getType());
  }

  @Test
  public final void testName()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Skill shojuld be called Pistol","Pistol",testSkill.getName());
  }

  @Test
  public final void testGroup()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Skill group should be Firearms",SkillGroup.FIREARMS,testSkill.getGroup());
  }

  @Test
  public final void testRank()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Should be Professional rank of 6",6,testSkill.getRank());
  }

  @Test
  public final void testCost()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Should be a cost of 24 BP",24,testSkill.getCost());
  }
  @Test
  public final void testToJSON() throws JSONException
  {
	  Skill testSkill = getPistolSkill();
	  String testobject = "{'cost':24,'name':'Pistol','group':'FIREARMS','rank':6,'type':'ACTIVE'}";
 	  JSONAssert.assertEquals(testobject, testSkill.toJSON(), true);
  } 
}

