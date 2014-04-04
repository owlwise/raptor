package creator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttributeTest
{
  public static Attribute getBodyhAttribute()
  {
    Attribute body = new Attribute();
    
    body.setDescription("Body");
    body.setValue(4l);
    body.setType(Type.PHYSICAL);
    body.setMaxValue(7l);
    body.setMinValue(2l);
    body.setCost(20);
    
    return body;
  }
  public static Attribute getAgilityAttribute()
  {
    Attribute agility = new Attribute();
    
    agility.setDescription("Agility");
    agility.setValue(6l);
    agility.setType(Type.PHYSICAL);
    agility.setMaxValue(6l);
    agility.setMinValue(1l);
    agility.setCost(65);
    
    return agility;
  }
  public static Attribute getReactionAttribute()
  {
    Attribute reaction = new Attribute();
    
    reaction.setDescription("Reaction");
    reaction.setValue(4l);
    reaction.setType(Type.PHYSICAL);
    reaction.setMaxValue(5l);
    reaction.setMinValue(1l);
    reaction.setCost(30);
    
    return reaction;
  }
  public static Attribute getStrengthAttribute()
  {
    Attribute strength = new Attribute();
    
    strength.setDescription("Strength");
    strength.setValue(3l);
    strength.setType(Type.PHYSICAL);
    strength.setMaxValue(8l);
    strength.setMinValue(3l);
    strength.setCost(0);
    
    return strength;
  }
  public static Attribute getCharismaAttribute()
  {
    Attribute charisma = new Attribute();
    
    charisma.setDescription("Charisma");
    charisma.setValue(2l);
    charisma.setType(Type.PHYSICAL);
    charisma.setMaxValue(6l);
    charisma.setMinValue(1l);
    charisma.setCost(10);
    
    return charisma;
  }
  public static Attribute getIntuitionAttribute()
  {
    Attribute intuition = new Attribute();
    
    intuition.setDescription("Intuition");
    intuition.setValue(5l);
    intuition.setType(Type.MENTAL);
    intuition.setMaxValue(6l);
    intuition.setMinValue(1l);
    intuition.setCost(40);
    
    return intuition;
  }
  public static Attribute getLogicAttribute()
  {
    Attribute logic = new Attribute();
    
    logic.setDescription("Logic");
    logic.setValue(2l);
    logic.setType(Type.MENTAL);
    logic.setMaxValue(6l);
    logic.setMinValue(1l);
    logic.setCost(10);
    
    return logic;
  }
  public static Attribute getWillpowerAttribute()
  {
    Attribute willpower = new Attribute();
    
    willpower.setDescription("Willpower");
    willpower.setValue(4l);
    willpower.setType(Type.MENTAL);
    willpower.setMaxValue(7l);
    willpower.setMinValue(2l);
    willpower.setCost(20);
    
    return willpower;
  }
  public static Attribute getEssenceAttribute()
  {
    Attribute essence = new Attribute();
    
    essence.setDescription("Essence");
    essence.setValue(6l);
    essence.setType(Type.ESSENCE);
    essence.setMaxValue(6l);
    essence.setMinValue(0l);
    essence.setCost(0);
    
    return essence;
  }
  public static Attribute getEdgeAttribute()
  {
    Attribute edge = new Attribute();
    
    edge.setDescription("Edge");
    edge.setValue(3l);
    edge.setType(Type.EDGE);
    edge.setMaxValue(6l);
    edge.setMinValue(1l);
    edge.setCost(20);
    
    return edge;
  }
  public static Attribute getInitiativeAttribute()
  {
    Attribute initiative = new Attribute();
    
    initiative.setDescription("Initiative");
    initiative.setValue(9l);
    initiative.setType(Type.INITIATIVE);
    initiative.setMaxValue(11l);
    initiative.setMinValue(2l);
    initiative.setCost(0);
    
    return initiative;
  }

  @Test
  public final void testDescription()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertEquals("Strength", testAttribute.getDescription());
  }

  @Test
  public final void testGetValue()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertSame("Faliure -- should be 3 ",3l, testAttribute.getValue());
  }

  @Test
  public final void testGetType()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertSame("Faliure -- Strength is a Physical Stat",Type.PHYSICAL, testAttribute.getType());
  }

  @Test
  public final void testGetMinValue()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertSame("Faliure -- Strength Min should be 3 ",3l, testAttribute.getMinValue());
  }

  @Test
  public final void testGetMaxValue()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertSame("Faliure -- Strength Max should be 8 ",8l, testAttribute.getMaxValue());
  }

  @Test
  public final void testGetCost()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertSame("Faliure -- Strength should cost 0 BP ",0, testAttribute.getCost());
  }

}
