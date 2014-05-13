package creator;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "attribute")
@GenericGenerator(name = "Attribute", strategy = "org.hibernate.id.enhanced.TableGenerator", parameters = {
		@Parameter(name = "segment_value", value = "CREATOR_PKG"),
		@Parameter(name = "increment_size", value = "10"),
		@Parameter(name = "optimizer", value = "pooled") })
public class Attribute implements Serializable {
	private static final long serialVersionUID = -6129778588064635430L;
	
	@Column(name = "attribCost")
	protected int cost;
	
	@Column(name = "attribDescription")
	protected String description;
	
	@Id
	@GeneratedValue(generator = "Attribute")
	@Column(name = "attribId")
	protected long id;
	
	@Column(name = "attribMaxValue")
	protected long maxValue;
	
	@Column(name = "attribeMinValue")
	protected long minValue;
	
	@Column(name = "attribType")
	protected Enum<Type> type;

	@Column(name = "attribValue")
	protected long value;

	public int getCost() {
		return cost;
	}

	public String getDescription() {
		return description;
	}

	public long getId() {
		return id;
	}

	public long getMaxValue() {
		return maxValue;
	}

	public long getMinValue() {
		return minValue;
	}

	public Enum<Type> getType() {
		return type;
	}

	public long getValue() {
		return value;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMaxValue(long maxValue) {
		this.maxValue = maxValue;
	}

	public void setMinValue(long minValue) {
		this.minValue = minValue;
	}

	public void setType(Enum<Type> type) {
		this.type = type;
	}

	public void setValue(long value) {
		this.value = value;
	}
}
