package executa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

import daos.UsuarioDao;
import entidades.Autor;
import entidades.Livro;
import entidades.Usuario;
import entidades.UsuarioPK;

public class exec {

	public static void main(String[] args) {
	// arquivo sendo gerenciado pelo git
		
	
			
	//UsuarioPK usuariopk = new UsuarioPK("89709887660", "luanacouto@gmail.com");
	//Usuario usuario = new Usuario(usuariopk, "Luana Silva Couto Couto");
	//Usuario usuario = new Usuario(new UsuarioPK("78041884105", "teste3@gmail.com"), "Teste de inserção");
					
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaRelacionamentos");
		EntityManager bd_livraria = emf.createEntityManager();
		bd_livraria.getTransaction().begin();

		UsuarioDao usuariodao = new UsuarioDao( bd_livraria);
		
		System.out.println("#####lista todos os usuarios#######################");
		List<Usuario> usuarios = usuariodao.listaUsuarios();
			for (Usuario usuario : usuarios) {
				System.out.println(usuario.toString());
			}
			System.out.println("                            ");
			System.out.println("#####lista usuario por nome especifico#######################");

			Usuario usuario = new Usuario();
			usuario = (Usuario) usuariodao.usuarioPorNome("Renatinho Silva Couto Couto");
			System.out.println(usuario.toString());
			
			System.out.println("                            ");
			System.out.println("############lista usuario por CPF###################");
			
			Usuario usuario1 = new Usuario();
			usuario1 = (Usuario) usuariodao.usuarioPorCpf("79041884220");
			System.out.println("O CPF digitado pertence a " + usuario1.getNome());
			
		bd_livraria.getTransaction().commit();

	}

}
