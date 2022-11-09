package com.ty.onetoone_bi_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone_bi_dto.Person;

public class PersonDAO {
	public void savePerson(Person person)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	entityTransaction.begin();
	
	entityManager.persist(person);
	
	entityManager.persist(person.getAc());
	
	entityTransaction.commit();
	}
}
