package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entidades.Autor;
import entidades.Livro;

/*
 * inserção na relação ONE-TO-MANY DE AUTOR-LIVRO
 */
public class testeInsercaoAutorLivro {

	public static void main(String[] args) {
		Autor autor = new Autor("José de Alencar");
		Livro livro1 = new Livro("Senhora");
		Livro livro2 = new Livro("Cinco minutos");
		Livro livro3 = new Livro("Lucíola");
		livro1.setAutor(autor);
		livro2.setAutor(autor);
		livro3.setAutor(autor);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaRelacionamentos");
		EntityManager bd_livraria = emf.createEntityManager();
		bd_livraria.getTransaction().begin();
		
			bd_livraria.persist(autor);
			bd_livraria.persist(livro1);
			bd_livraria.persist(livro2);
			
		bd_livraria.getTransaction().commit();
		
	}

}
