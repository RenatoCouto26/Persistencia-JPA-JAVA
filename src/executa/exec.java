package executa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entidades.Autores;
import entidades.Usuario;
import entidades.UsuarioPK;

public class exec {

	public static void main(String[] args) {
		// arquivo sendo gerenciado pelo git
		
	//	Autores autor = new Autores();
	//	autor.setNome("Clementino da silva Magalhaes");
		
	//UsuarioPK usuariopk = new UsuarioPK("89709887660", "luanacouto@gmail.com");
	//Usuario usuario = new Usuario(usuariopk, "Luana Silva Couto");
		
		Usuario usuario = new Usuario(new UsuarioPK("78041884220", "renatinho@gmail.com"), "Renatinho Silva Couto");
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaRelacionamentos");
		EntityManager bd_livraria = emf.createEntityManager();

		bd_livraria.getTransaction().begin();
		
		bd_livraria.persist(usuario);
			
		bd_livraria.getTransaction().commit();

	}

}
