package creator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="SequenceGenerator", sequenceName="mySequence")
@Table(name = "attribute")
public class Attribute
{
  int cost;
  String description;
  long id;
  long maxValue;
  long minValue;
  Enum<Type> type;
  long value;


  @Column(name = "cost")
  public int getCost()
  {
    return cost;
  }

  @Column(name = "description")
  public String getDescription()
  {
    return description;
  }

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO, generator="SequenceGenerator")
  public long getId()
  {
    return id;
  }

  @Column(name = "maxvalue")
  public long getMaxValue()
  {
    return maxValue;
  }

  @Column(name = "minvalue")
  public long getMinValue()
  {
    return minValue;
  }

  @Column(name = "type")
  public Enum<Type> getType()
  {
    return type;
  }

  @Column(name = "value")
  public long getValue()
  {
    return value;
  }

  public void setCost(int cost)
  {
    this.cost = cost;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public void setId(long id)
  {
    this.id = id;
  }

  public void setMaxValue(long maxValue)
  {
    this.maxValue = maxValue;
  }

  public void setMinValue(long minValue)
  {
    this.minValue = minValue;
  }

  public void setType(Enum<Type> type)
  {
    this.type = type;
  }

  public void setValue(long value)
  {
    this.value = value;
  }
}
