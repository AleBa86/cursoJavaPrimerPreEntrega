package com.coderHouse.dao;

import org.springframework.stereotype.Service;

import com.coderHouse.models.Producto;
import com.coderHouse.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void persistirUser(Usuario usuario) {
		em.persist(usuario);
	}

	@Transactional
	public void persistirProd(Producto producto) {
		em.persist(producto);
	}
}
