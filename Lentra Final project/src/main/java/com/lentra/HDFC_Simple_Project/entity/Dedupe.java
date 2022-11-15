package com.lentra.HDFC_Simple_Project.entity;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Document(collection = "dedupe")  //databases (TABLE)  in mongoDB 
public class Dedupe {
	
	
	private String ref_id;

	private String name;

	private String mobile_no;
	
	private String applicant_type;

	private String email_id;

	private String date_of_birth;

	private String doi;

	private String external_customer_id;

	private String udyam_no;

	private String loyality_card;

	private String employer_name;

	private String kyc_details;

	private String applicant_dedupe_check;

//	public Dedupe() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Dedupe(String ref_id, String name, String mobile_no, String applicant_type, String email_id,
			String date_of_birth, String doi, String external_customer_id, String udyam_no, String loyality_card,
			String employer_name, String kyc_details, String applicant_dedupe_check) {
		super();
		this.ref_id = ref_id;
		this.name = name;
		this.mobile_no = mobile_no;
		this.applicant_type = applicant_type;
		this.email_id = email_id;
		this.date_of_birth = date_of_birth;
		this.doi = doi;
		this.external_customer_id = external_customer_id;
		this.udyam_no = udyam_no;
		this.loyality_card = loyality_card;
		this.employer_name = employer_name;
		this.kyc_details = kyc_details;
		this.applicant_dedupe_check = applicant_dedupe_check;
	}

	@Override
	public String toString() {
		return "Dedupe [ref_id=" + ref_id + ", name=" + name + ", mobile_no=" + mobile_no + ", applicant_type="
				+ applicant_type + ", email_id=" + email_id + ", date_of_birth=" + date_of_birth + ", doi=" + doi
				+ ", external_customer_id=" + external_customer_id + ", udyam_no=" + udyam_no + ", loyality_card="
				+ loyality_card + ", employer_name=" + employer_name + ", kyc_details=" + kyc_details
				+ ", applicant_dedupe_check=" + applicant_dedupe_check + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicant_dedupe_check, applicant_type, date_of_birth, doi, email_id, employer_name,
				external_customer_id, kyc_details, loyality_card, mobile_no, name, ref_id, udyam_no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dedupe other = (Dedupe) obj;
		return Objects.equals(applicant_dedupe_check, other.applicant_dedupe_check)
				&& Objects.equals(applicant_type, other.applicant_type)
				&& Objects.equals(date_of_birth, other.date_of_birth) && Objects.equals(doi, other.doi)
				&& Objects.equals(email_id, other.email_id) && Objects.equals(employer_name, other.employer_name)
				&& Objects.equals(external_customer_id, other.external_customer_id)
				&& Objects.equals(kyc_details, other.kyc_details) && Objects.equals(loyality_card, other.loyality_card)
				&& Objects.equals(mobile_no, other.mobile_no) && Objects.equals(name, other.name)
				&& Objects.equals(ref_id, other.ref_id) && Objects.equals(udyam_no, other.udyam_no);
	}

	public String getRef_id() {
		return ref_id;
	}

	public void setRef_id(String ref_id) {
		this.ref_id = ref_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getApplicant_type() {
		return applicant_type;
	}

	public void setApplicant_type(String applicant_type) {
		this.applicant_type = applicant_type;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getExternal_customer_id() {
		return external_customer_id;
	}

	public void setExternal_customer_id(String external_customer_id) {
		this.external_customer_id = external_customer_id;
	}

	public String getUdyam_no() {
		return udyam_no;
	}

	public void setUdyam_no(String udyam_no) {
		this.udyam_no = udyam_no;
	}

	public String getLoyality_card() {
		return loyality_card;
	}

	public void setLoyality_card(String loyality_card) {
		this.loyality_card = loyality_card;
	}

	public String getEmployer_name() {
		return employer_name;
	}

	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}

	public String getKyc_details() {
		return kyc_details;
	}

	public void setKyc_details(String kyc_details) {
		this.kyc_details = kyc_details;
	}

	public String getApplicant_dedupe_check() {
		return applicant_dedupe_check;
	}

	public void setApplicant_dedupe_check(String applicant_dedupe_check) {
		this.applicant_dedupe_check = applicant_dedupe_check;
	}
	
	
	



}
