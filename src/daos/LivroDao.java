package daos;

import java.util.List;

import javax.persistence.EntityManager;

import entidades.Livro;

public class LivroDao {
	
	EntityManager dbLivraria;
	
	public LivroDao(EntityManager dbLivraria) {
		this.dbLivraria=dbLivraria;
	}

	public List<Livro> ListaDeLivros() {
	 return dbLivraria.createNamedQuery("Livro.findAll", Livro.class).getResultList();
	}
	
	public Livro SelecionaLivroPorId(Integer id) {
		 return dbLivraria.createNamedQuery("Livro.findById", Livro.class)
				 .setParameter("id", id).getSingleResult();
		}
	
}
