package daos;

import java.util.List;
import javax.persistence.EntityManager;
import entidades.Usuario;



public class UsuarioDao {
	
	public UsuarioDao(EntityManager bd_livraria) {
		this.bd_livraria = bd_livraria;
	}

	EntityManager bd_livraria;
	
	
			public List<Usuario> listaUsuarios(){
				return bd_livraria.createNamedQuery("Usuario.findall", Usuario.class)
						.getResultList();	
			}

			public List<Usuario> usuarioPorNome( String nome) {
				return bd_livraria.createNamedQuery("Usuario.findbynome", Usuario.class)
						.setParameter("nome" , "%"+nome+"%").getResultList();
			}
			
			public Usuario usuarioPorCpf( String cpf) {
				return bd_livraria.createNamedQuery("Usuario.findbycpf", Usuario.class)
						.setParameter("cpf" , cpf).getSingleResult();
			}
}
