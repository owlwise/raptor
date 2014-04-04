package creator;

public class Skill
{
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

}
