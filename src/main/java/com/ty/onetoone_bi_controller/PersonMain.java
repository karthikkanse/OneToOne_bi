package com.ty.onetoone_bi_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone_bi_dao.PersonDAO;
import com.ty.onetoone_bi_dto.AdharCard;
import com.ty.onetoone_bi_dto.Person;

public class PersonMain {
public static void main(String[] args) {
	
	
	AdharCard ac=new AdharCard();
	ac.setNumber(33452589);
	ac.setAddress("BNG");
	
	
	Person p=new Person();
	p.setName("abhi");
	p.setEmail("ab@123");
	p.setAddress("B");
	p.setAc(ac);
	ac.setPerson(p);
	
	
	PersonDAO dao=new PersonDAO();
	dao.savePerson(p);
}
}
