package creator;

public class Quality
{
  Enum<Type> type;
  String description;
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
  public int getCost()
  {
    return cost;
  }
  public void setCost(int cost)
  {
    this.cost = cost;
  }
}
