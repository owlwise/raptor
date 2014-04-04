package creator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SkillTest
{
  public static Skill getPistolSkill()
  {
    Skill pistolSkill = new Skill();
    
    pistolSkill.setCost(24);;
    pistolSkill.setDescription("Pistol");
    pistolSkill.setGroup(SkillGroup.FIREARMS);
    pistolSkill.setRank(6);
    pistolSkill.setType(Type.ACTIVE);
    
    return pistolSkill;
  }
  public static Skill getAutomaticsSkill()
  {
    Skill automatics = new Skill();
    
    automatics.setCost(16);;
    automatics.setDescription("Automatics");
    automatics.setGroup(SkillGroup.FIREARMS);
    automatics.setRank(4);
    automatics.setType(Type.ACTIVE);
    
    return automatics;
  }
  public static Skill getDodgeSkill()
  {
    Skill dodge = new Skill();
    
    dodge.setCost(16);;
    dodge.setDescription("Dodge");
    dodge.setGroup(SkillGroup.NONE);
    dodge.setRank(4);
    dodge.setType(Type.ACTIVE);
    
    return dodge;
  }
  public static Skill getLongArmsSkill()
  {
    Skill longArms = new Skill();
    
    longArms.setCost(12);;
    longArms.setDescription("Long Arms");
    longArms.setGroup(SkillGroup.FIREARMS);
    longArms.setRank(3);
    longArms.setType(Type.ACTIVE);
    
    return longArms;
  }
  public static Skill getHeavyWeaponsSkill()
  {
    Skill heavyWeapons = new Skill();
    
    heavyWeapons.setCost(8);;
    heavyWeapons.setDescription("Heavy Weapons");
    heavyWeapons.setGroup(SkillGroup.FIREARMS);
    heavyWeapons.setRank(2);
    heavyWeapons.setType(Type.ACTIVE);
    
    return heavyWeapons;
  }
  public static Skill getThrownWeaponsSkill()
  {
    Skill thrownWeapons = new Skill();
    
    thrownWeapons.setCost(8);;
    thrownWeapons.setDescription("Thrown Weapons");
    thrownWeapons.setGroup(SkillGroup.NONE);
    thrownWeapons.setRank(2);
    thrownWeapons.setType(Type.ACTIVE);
    
    return thrownWeapons;
  }
  public static Skill getNegotiationSkill()
  {
    Skill negotiation = new Skill();
    
    negotiation.setCost(8);;
    negotiation.setDescription("Negotiation");
    negotiation.setGroup(SkillGroup.INFLUENCE);
    negotiation.setRank(2);
    negotiation.setType(Type.ACTIVE);
    
    return negotiation;
  }
  public static Skill getInfiltrationSkill()
  {
    Skill infiltration = new Skill();
    
    infiltration.setCost(8);;
    infiltration.setDescription("Infiltration");
    infiltration.setGroup(SkillGroup.STEALTH);
    infiltration.setRank(2);
    infiltration.setType(Type.ACTIVE);
    
    return infiltration;
  }
  public static Skill getArmorerSkill()
  {
    Skill armourer = new Skill();
    
    armourer.setCost(8);;
    armourer.setDescription("Armorer");
    armourer.setGroup(SkillGroup.NONE);
    armourer.setRank(2);
    armourer.setType(Type.ACTIVE);
    
    return armourer;
  }
  public static Skill getPeceptionSkill()
  {
    Skill perception = new Skill();
    
    perception.setCost(16);;
    perception.setDescription("Perception");
    perception.setGroup(SkillGroup.NONE);
    perception.setRank(4);
    perception.setType(Type.ACTIVE);
    
    return perception;
  }
  public static Skill getEtiquetteSkill()
  {
    Skill etiquette = new Skill();
    
    etiquette.setCost(4);;
    etiquette.setDescription("Etiquette - Military specialization");
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
  public final void testDescription()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Skill shojuld be called Pistol","Pistol",testSkill.getDescription());
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

}
