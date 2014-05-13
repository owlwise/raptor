package creator;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.*;
import org.json.JSONException;
import org.json.JSONObject;

@Entity
@Table(name = "SKILLS")
@GenericGenerator(name = "Skill", strategy = "org.hibernate.id.enhanced.TableGenerator", parameters = {
		@Parameter(name = "segment_value", value = "CREATOR_PKG"),
		@Parameter(name = "increment_size", value = "10"),
		@Parameter(name = "optimizer", value = "pooled") })
public class Skill implements Serializable {
	private static final long serialVersionUID = 473600553070052346L;

	@Id
	@GeneratedValue(generator = "Skill")
	@Column(name = "skillId")
	private Long skillId;

	@Column(name = "skillName")
	protected String name;

	@Column(name = "skillType")
	protected Enum<Type> type;

	@Column(name = "skillDescription")
	protected String description;

	@Column(name = "skillgroup")
	protected Enum<SkillGroup> group;

	@Column(name = "skillRank")
	protected int rank;

	@Column(name = "skillCost")
	protected int cost;

	public Enum<Type> getType() {
		return type;
	}

	public void setType(Enum<Type> type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Enum<SkillGroup> getGroup() {
		return group;
	}

	public void setGroup(Enum<SkillGroup> group) {
		this.group = group;
	}

	public int getRank() {
		return rank;
	}

	public JSONObject toJSON() {
		JSONObject json = new JSONObject();
		try {
			json.put("cost", this.cost);
			json.put("name", this.name);
			json.put("description", this.getDescription());
			json.put("group", this.getGroup().name());
			json.put("rank", this.getRank());
			json.put("type", this.getType().name());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return json;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

}
