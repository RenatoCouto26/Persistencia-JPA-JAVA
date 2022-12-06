package teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import daos.LivroDao;
import entidades.Livro;
import entidades.Venda;

/*
 * teste de inserção no relacionamento Many-to-Many das entidades Venda-Livro 
 */
public class testeVendaLivros {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaRelacionamentos");
		EntityManager bd_livraria = emf.createEntityManager();
		bd_livraria.getTransaction().begin();
		
			LivroDao livrodao = new LivroDao(bd_livraria);
			List<Livro> lista = new ArrayList<Livro>();
						 
						
			lista.add(livrodao.SelecionaLivroPorId(4));
			lista.add(livrodao.SelecionaLivroPorId(5));
			lista.add(livrodao.SelecionaLivroPorId(6));
			
						
			Venda venda = new Venda();
			venda.setNota(2);
			venda.setTotalDaVenda(200);
			venda.setLivroLista(lista);
			
			//System.out.println(venda.toString());
			bd_livraria.persist(venda);
			
			
		bd_livraria.getTransaction().commit();

	}

}
