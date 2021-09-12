package com.garanti.loanapproval;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "firstName")
	private java.lang.String firstName;
	@org.kie.api.definition.type.Label(value = "lastName")
	private java.lang.String lastName;
	@org.kie.api.definition.type.Label(value = "dob")
	private java.lang.String dob;
	@org.kie.api.definition.type.Label(value = "creditScore")
	private java.lang.Float creditScore;
	@org.kie.api.definition.type.Label(value = "income")
	private java.lang.Integer income;

	public Person() {
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public java.lang.String getDob() {
		return this.dob;
	}

	public void setDob(java.lang.String dob) {
		this.dob = dob;
	}

	public java.lang.Float getCreditScore() {
		return this.creditScore;
	}

	public void setCreditScore(java.lang.Float creditScore) {
		this.creditScore = creditScore;
	}

	public java.lang.Integer getIncome() {
		return this.income;
	}

	public void setIncome(java.lang.Integer income) {
		this.income = income;
	}

	public Person(java.lang.String firstName, java.lang.String lastName,
			java.lang.String dob, java.lang.Float creditScore,
			java.lang.Integer income) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.creditScore = creditScore;
		this.income = income;
	}

}