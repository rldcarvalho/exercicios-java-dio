package main.java.com.digitalinnovationone.jpa;

import main.java.javax.persistence.EntityManager;
import main.java.javax.persistence.EntityManagerFactory;
import main.java.javax.persistence.Persistence;

import com.digitalinnovationone.jpa.model.Cliente;

public class CadastroCliente {

	public static void main(String... string) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Cliente cliente = entityManager.find(Cliente.class, 1);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println(cliente.getCarros().get(0).getMarca());


	}
}
