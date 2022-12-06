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
						 
			Livro l =  new Livro();
			Livro l2 = new Livro();
			Livro l3 = new Livro();
			
			l= livrodao.SelecionaLivroPorId(3);
			l2= livrodao.SelecionaLivroPorId(7);
			l3= livrodao.SelecionaLivroPorId(8);
			
			lista.add(l);
			lista.add(l2);
			lista.add(l3);
			
			for (Livro livro : lista) {
				System.out.println(livro.getNome());
			}
			
			Venda venda = new Venda();
			venda.setNota(1);
			venda.setTotalDaVenda(150);
			venda.setLivroLista(lista);
			
			//System.out.println(venda.toString());
			bd_livraria.persist(venda);
			
			
		bd_livraria.getTransaction().commit();

	}

}
