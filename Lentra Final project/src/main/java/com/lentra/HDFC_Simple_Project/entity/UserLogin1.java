package com.lentra.HDFC_Simple_Project.entity;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userLogin")
public class UserLogin1 {
	
	
	private String mobileNumber;
	private String emailId;
	private String name;
	private String refId;
	private String externalId;
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public UserLogin1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserLogin1(String mobileNumber, String emailId, String name, String refId, String externalId) {
		super();
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.name = name;
		this.refId = refId;
		this.externalId = externalId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(emailId, externalId, mobileNumber, name, refId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserLogin1 other = (UserLogin1) obj;
		return Objects.equals(emailId, other.emailId) && Objects.equals(externalId, other.externalId)
				&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(name, other.name)
				&& Objects.equals(refId, other.refId);
	}
	@Override
	public String toString() {
		return "UserLogin1 [mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", name=" + name + ", refId="
				+ refId + ", externalId=" + externalId + "]";
	}
	
	
	

}
