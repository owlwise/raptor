package creator;

import static org.junit.Assert.*;

import org.junit.Test;

public class QualityTest
{
  public static Quality getAmbidextrousQuality()
  {
    Quality ambidextrous = new Quality();
    
    ambidextrous.setCost(5);
    ambidextrous.setDescription("Ambidextrous");
    ambidextrous.setType(Type.POSITIVE);
    
    return ambidextrous;
  }
  public static Quality getScorchedQuality()
  {
    Quality scorched = new Quality();
    
    scorched.setCost(5);
    scorched.setDescription("Scorched");
    scorched.setType(Type.NEGATIVE);
    
    return scorched;
  }

  @Test
  public final void testType()
  {
    Quality testQuality = getAmbidextrousQuality();
    assertSame("Quality tyep should be positive",Type.POSITIVE,testQuality.getType());
  }

  @Test
  public final void testDescription()
  {
    Quality testQuality = getAmbidextrousQuality();
    assertSame("Quality name should be Ambidextrous","Ambidextrous",testQuality.getDescription());
  }

  @Test
  public final void testCost()
  {
    Quality testQuality = getAmbidextrousQuality();
    assertSame("Cost should be 5 BO",5,testQuality.getCost());
  }

}
