package daos;

import javax.persistence.EntityManager;

import entidades.Autor;

public class AutorDao {
	
	EntityManager bd_livraria;
	
	public AutorDao(EntityManager bd_livraria) {
		this.bd_livraria = bd_livraria;
	}
	
	
	public Autor autorPorId( Integer id) {
		return bd_livraria.createNamedQuery("Autor.findbyid", Autor.class)
				.setParameter("id" , id).getSingleResult();
	}

}
