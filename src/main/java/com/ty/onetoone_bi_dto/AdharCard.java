package com.ty.onetoone_bi_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class AdharCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private long number;
private String address;
@OneToOne(mappedBy = "ac")
private Person person;
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
