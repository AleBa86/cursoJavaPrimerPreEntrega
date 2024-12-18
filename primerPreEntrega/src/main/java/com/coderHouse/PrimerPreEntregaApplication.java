package com.coderHouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderHouse.dao.DaoFactory;
import com.coderHouse.models.Producto;
import com.coderHouse.models.Usuario;

@SpringBootApplication
public class PrimerPreEntregaApplication implements CommandLineRunner{
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(PrimerPreEntregaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try {
			
			Producto prod1 = new Producto("SDD");
			Producto prod2 = new Producto("Memoria");
			Producto prod3 = new Producto("Mouse");
			Producto prod4 = new Producto("Teclado");
			
			Usuario user1 = new Usuario("Alejandro", "Baez", 32335986, "u196240");
			Usuario user2 = new Usuario("Walter", "Ayala", 33335986, "u196241");
			Usuario user3 = new Usuario("Brenda", "Zela", 32335978, "u196242");
			Usuario user4 = new Usuario("Guille", "Willy", 32335983, "u196243");
			
			dao.persistirProd(prod1);
			dao.persistirProd(prod2);
			dao.persistirProd(prod3);
			dao.persistirProd(prod4);
			
			dao.persistirUser(user1);
			dao.persistirUser(user2);
			dao.persistirUser(user3);
			dao.persistirUser(user4);
		}catch(Exception e) {
			e.printStackTrace(System.err);
		}

		
	}

}
