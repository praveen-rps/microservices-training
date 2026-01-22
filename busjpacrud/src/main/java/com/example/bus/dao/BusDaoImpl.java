package com.example.bus.dao;

import com.example.bus.entity.Bus;
import com.example.bus.util.JPAUtil;
import jakarta.persistence.*;
import java.util.List;

public class BusDaoImpl implements BusDao{
	public void save(Bus bus) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(bus);
		txn.commit();
		em.close();
	}

	public Bus find(Long id) {
		EntityManager em = JPAUtil.getEntityManager();
		Bus b = em.find(Bus.class, id);
		em.close();
		return b;
	}

	public List<Bus> findAll() {
		EntityManager em = JPAUtil.getEntityManager();
		List<Bus> list = em.createQuery("from Bus", Bus.class).getResultList();
		em.close();
		return list;
	}

	public void update(Long id, Bus newBus) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Bus b = em.find(Bus.class, id);
		if (b != null) {
			b.setBusNumber(newBus.getBusNumber());
			b.setSource(newBus.getSource());
			b.setDestination(newBus.getDestination());
			b.setCapacity(newBus.getCapacity());
		}
		em.getTransaction().commit();
		em.close();
	}

	public void delete(Long id) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Bus b = em.find(Bus.class, id);
		if (b != null)
			em.remove(b);
		em.getTransaction().commit();
		em.close();
	}
}
