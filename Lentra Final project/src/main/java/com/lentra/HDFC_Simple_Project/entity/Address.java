package com.lentra.HDFC_Simple_Project.entity;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
public class Address {
	
	

	private String residence;
	private String permanent;
	private String office;
	private String other;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String residence, String permanent, String office, String other) {
		super();
		this.residence = residence;
		this.permanent = permanent;
		this.office = office;
		this.other = other;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getPermanent() {
		return permanent;
	}
	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	@Override
	public int hashCode() {
		return Objects.hash(office, other, permanent, residence);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(office, other.office) && Objects.equals(this.other, other.other)
				&& Objects.equals(permanent, other.permanent) && Objects.equals(residence, other.residence);
	}
	@Override
	public String toString() {
		return "Address [residence=" + residence + ", permanent=" + permanent + ", office=" + office + ", other="
				+ other + "]";
	}
	
	
	
	
	
	
	
	
	

}
