package com.example.bus.util;

import jakarta.persistence.*;

public class JPAUtil {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("busPU");
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}