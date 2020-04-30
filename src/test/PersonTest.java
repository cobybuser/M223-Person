package test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.Person;

public class PersonTest {

	static EntityManagerFactory em;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		em = Persistence.createEntityManagerFactory("ch.gibm.hibernatetest");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		em.close();
	}

	@Test
	public void saveAutoObject() {
		EntityManager entityManager = em.createEntityManager();
		entityManager.getTransaction().begin();
		Person p = new Person();
		
		p.setName("Buser");
		p.setVorname("Coby");
		p.setStrasse("Rainweg");
		p.setOrt("Füllinsdorf");
		p.setPlz(4414);
		p.setTelefonNr(0617654321);
		
		entityManager.persist(p);
		entityManager.getTransaction().commit();
		entityManager.close();
		assertTrue(p.getId() > 0);
	}

}
