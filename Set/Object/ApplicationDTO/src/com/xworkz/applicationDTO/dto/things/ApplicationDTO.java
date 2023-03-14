package com.xworkz.applicationDTO.dto.things;

import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

@SuppressWarnings("serial")
public class ApplicationDTO implements Serializable {
	private String name;
	private String id;
	private double version;
	private Locale cretedBy;

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", id=" + id + ", version=" + version + ", cretedBy=" + cretedBy + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId() {
		this.id = id ;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion() {
		this.version = version;
	}

	public Locale getCretedBy() {
		return cretedBy;
	}

	public void setCretedBy() {
		this.cretedBy = cretedBy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cretedBy, id, name, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		return Objects.equals(cretedBy, other.cretedBy) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}

}
