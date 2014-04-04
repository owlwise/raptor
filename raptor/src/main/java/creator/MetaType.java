package creator;

public enum MetaType
{
  HUMAN(0),ORK(20),DWARF(25),ELF(30),TROLL(40);
  
  @SuppressWarnings("unused")
  private int cost;
  
  private MetaType(int cost)
  {
    this.cost = cost;
  }
}
