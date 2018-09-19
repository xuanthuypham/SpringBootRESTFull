package com.xuanthuy.springbootdemo.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xuanthuy.springbootdemo.entity.BankAccount;
@Repository
@Transactional
public class BankAccountDAO implements com.xuanthuy.springbootdemo.dao.interfaces.BankAccountDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BankAccount> getAll() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query<BankAccount> que = session.createQuery("from "+BankAccount.class.getName());
		return que.getResultList();
	}

	@Override
	public BankAccount findById(Long id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		try {
			return session.get(BankAccount.class, id);
		}catch (NoResultException e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public void insert(BankAccount account) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(account);
	}

	@Override
	public void update(BankAccount account) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(account);
	}

	@Override
	public void delete(BankAccount account) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(account);
	}

}
