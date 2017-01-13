package com.niit.collaboration.dao.impl;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collaboration.dao.FriendDAO;
import com.niit.collaboration.model.Friend;



@Repository("friendDAO")
public class FriendDAOIMPL implements FriendDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public FriendDAOIMPL(SessionFactory sessionFactory)
	{
		this.sessionFactory =sessionFactory;
	}
	

	public boolean save(Friend friend) {
		try {
			sessionFactory.getCurrentSession().save(friend);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Friend friend) {
		try {
			sessionFactory.getCurrentSession().delete(friend);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}


	public List<Friend> get(String emailId) {
		String hql = "From Friend";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	

}
