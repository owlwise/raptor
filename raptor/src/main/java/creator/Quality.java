package creator;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "QUALITY")
@GenericGenerator(name = "Quality", strategy = "org.hibernate.id.enhanced.TableGenerator", parameters = {
		@Parameter(name = "segment_value", value = "CREATOR_PKG"),
		@Parameter(name = "increment_size", value = "10"),
		@Parameter(name = "optimizer", value = "pooled") })
public class Quality implements Serializable {
	private static final long serialVersionUID = 6084389118539278142L;

	@Id
	@GeneratedValue(generator = "Quality")
	@Column(name = "qualityId")
	private long id;

	@Column(name = "qualityType")
	protected Enum<Type> type;

	@Column(name = "qualityDescription")
	protected String description;

	@Column(name = "qualityCost")
	protected int cost;

	public Enum<Type> getType() {
		return type;
	}

	public void setType(Enum<Type> type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
