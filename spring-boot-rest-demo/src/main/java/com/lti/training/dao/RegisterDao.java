package com.lti.training.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.training.entity.User;

@Repository
public class RegisterDao {
	
		@PersistenceContext
		private EntityManager entityManager;
		
		public int save(User user) {
		User u=	entityManager.merge(user);
		return u.getId();
		}

		public User fetch(String email) {
			return (User)entityManager.createQuery("select u from User u where u.email=:em").setParameter("em", email).getSingleResult();
		}

}
