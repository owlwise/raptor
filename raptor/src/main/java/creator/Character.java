package creator;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "CHARACTER")
@GenericGenerator(name = "Character", strategy = "org.hibernate.id.enhanced.TableGenerator", parameters = {
		@Parameter(name = "segment_value", value = "CREATOR_PKG"),
		@Parameter(name = "increment_size", value = "10"),
		@Parameter(name = "optimizer", value = "pooled") })
public class Character {
	@Id
	@GeneratedValue(generator = "Character")
	@Column(name = "characterId")
	private long id;

	@Column(name = "characterName")
	protected String name;

	@Column(name = "characterRace")
	protected Enum<MetaType> race;

	@Column(name = "characterQualities")
	protected List<Quality> qualities;

	@Column(name = "characterAttributes")
	protected List<Attribute> attributes;

	@Column(name = "characterSkills")
	protected List<Skill> skills;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Enum<MetaType> getRace() {
		return race;
	}

	public void setRace(Enum<MetaType> race) {
		this.race = race;
	}

	public List<Quality> getQualities() {
		return qualities;
	}

	public void setQualities(List<Quality> qualities) {
		this.qualities = qualities;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
