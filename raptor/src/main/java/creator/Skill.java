package creator;

import org.json.JSONException;
import org.json.JSONObject;

public class Skill
{
  String name;
  Enum<Type> type;
  String description;
  Enum<SkillGroup> group;
  int rank;
  int cost;
  
  public Enum<Type> getType()
  {
    return type;
  }
  public void setType(Enum<Type> type)
  {
    this.type = type;
  }
  public String getDescription()
  {
    return description;
  }
  public void setDescription(String description)
  {
    this.description = description;
  }
  public Enum<SkillGroup> getGroup()
  {
    return group;
  }
  public void setGroup(Enum<SkillGroup> group)
  {
    this.group = group;
  }
  public int getRank()
  {
    return rank;
  }
  public JSONObject toJSON()
  {
	  JSONObject json = new JSONObject();
	  try 
	  {
		  json.put("cost", this.cost);
		  json.put("name",  this.name);
		  json.put("description", this.getDescription());
		  json.put("group", this.getGroup().name());
		  json.put("rank", this.getRank());
		  json.put("type", this.getType().name());
	  } 
	  catch (JSONException e) 
	  {
		  e.printStackTrace();
	  }
	  return json;
  }
  public void setRank(int rank)
  {
    this.rank = rank;
  }
  public int getCost()
  {
    return cost;
  }
  public void setCost(int cost)
  {
    this.cost = cost;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
