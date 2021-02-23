package tests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.mucino.hibernate.modelo.Empleado;

public class TestEmpleados {
	
	//@PersistenceContext(unitName = "aplicacion")
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Crear el gestor de persistencia (EM)
		emf = Persistence.createEntityManagerFactory("aplicacion"); 
		manager = emf.createEntityManager();
		
		//lenguaje JPQL
		List<Empleado> empleados = new ArrayList<>();
		empleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		
		System.out.println("En esta base de datos hay " + empleados.size() + " empleados.");
	}

}
