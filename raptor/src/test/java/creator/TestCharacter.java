package creator;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestCharacter
{
  public static Character getDwarfWeaponsExpert()
  {
    Character character = new Character();
    
    
    List<Attribute> attributes = new LinkedList<Attribute>();
    attributes.add(AttributeTest.getAgilityAttribute());
    attributes.add(AttributeTest.getBodyhAttribute());
    attributes.add(AttributeTest.getCharismaAttribute());
    attributes.add(AttributeTest.getEdgeAttribute());
    attributes.add(AttributeTest.getEssenceAttribute());
    attributes.add(AttributeTest.getInitiativeAttribute());
    attributes.add(AttributeTest.getIntuitionAttribute());
    attributes.add(AttributeTest.getLogicAttribute());
    attributes.add(AttributeTest.getReactionAttribute());
    attributes.add(AttributeTest.getStrengthAttribute());
    attributes.add(AttributeTest.getWillpowerAttribute());

    List<Quality> qualities = new LinkedList<Quality>();
    qualities.add(QualityTest.getScorchedQuality());

    List<Skill> skills = new LinkedList<Skill>();
    skills.add(SkillTest.getArmorerSkill());
    skills.add(SkillTest.getAutomaticsSkill());
    skills.add(SkillTest.getDodgeSkill());
    skills.add(SkillTest.getEtiquetteSkill());
    skills.add(SkillTest.getHeavyWeaponsSkill());
    skills.add(SkillTest.getInfiltrationSkill());
    skills.add(SkillTest.getLongArmsSkill());
    skills.add(SkillTest.getNegotiationSkill());
    skills.add(SkillTest.getPeceptionSkill());
    skills.add(SkillTest.getPistolSkill());
    skills.add(SkillTest.getThrownWeaponsSkill());

    character.setRace(MetaType.DWARF);
    character.setAttributes(attributes);
    character.setName("Dwarven Weapons Expert");
    character.setQualities(qualities);
    character.setSkills(skills);
    
    return character;
  }

  @Test
  public final void testName()
  {
    Character testCharacter = getDwarfWeaponsExpert();
    assertSame("Name should be Dwarven Weapons Expert","Dwarven Weapons Expert",testCharacter.getName());
  }

  @Test
  public final void testRace()
  {
    Character testCharacter = getDwarfWeaponsExpert();
    assertSame("Race should be dwarven",MetaType.DWARF,testCharacter.getRace());
  }

  @Test
  public final void testQualities()
  {
    Character testCharacter = getDwarfWeaponsExpert();
    assertSame("Should have one quality",1,testCharacter.getQualities().size());
    assertSame("Should be a quality",Quality.class,testCharacter.getQualities().get(0).getClass());
    
    Quality testAdd = QualityTest.getAmbidextrousQuality();
    testCharacter.getQualities().add(testAdd);
    assertSame("should have two qualities now",2,testCharacter.getQualities().size());
  }

  @Test
  public final void testAttributes()
  {
    Character testCharacter = getDwarfWeaponsExpert();
    assertSame("Should have 11 attributes",11,testCharacter.getAttributes().size());
    assertSame("Should be an Attribute",Attribute.class,testCharacter.attributes.get(0).getClass());
    
    Attribute testAdd = new Attribute();
    testCharacter.attributes.add(testAdd);
    assertSame("should have 12 attributes now",12,testCharacter.getAttributes().size());
  }

  @Test
  public final void testSkills()
  {
    Character testCharacter = getDwarfWeaponsExpert();
    assertSame("Should have 11 skills",11,testCharacter.skills.size());
    assertSame("Should be an Skill",Skill.class,testCharacter.skills.get(0).getClass());
    
    Skill testAdd = new Skill();
    testCharacter.skills.add(testAdd);
    assertSame("should have 12 skills now",12,testCharacter.skills.size());
  }

}
