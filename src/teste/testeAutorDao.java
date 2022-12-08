package teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

import daos.AutorDao;
import daos.UsuarioDao;
import entidades.Autor;
import entidades.Livro;
import entidades.Usuario;
import entidades.UsuarioPK;

public class testeAutorDao {

	public static void main(String[] args) {
	
					
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaRelacionamentos");
		EntityManager bd_livraria = emf.createEntityManager();
		bd_livraria.getTransaction().begin();
		
			AutorDao autordao = new AutorDao(bd_livraria);
			Autor autor = autordao.autorPorId(13375);
			System.out.println(autor.getNome());
				
		bd_livraria.getTransaction().commit();

	}

}
