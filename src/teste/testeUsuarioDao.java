package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import daos.UsuarioDao;
import entidades.Usuario;

public class testeUsuarioDao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaRelacionamentos");
		EntityManager bd_livraria = emf.createEntityManager();
		bd_livraria.getTransaction().begin();
				UsuarioDao usuariodao = new UsuarioDao(bd_livraria);
				Usuario usuario = usuariodao.usuarioPorCpf("79041884220");
				System.out.println(usuario.getNome());
		bd_livraria.getTransaction().commit();

	}

}
