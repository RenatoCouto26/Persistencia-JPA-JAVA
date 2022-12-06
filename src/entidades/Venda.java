package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the venda database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Venda.findAll", query="SELECT v FROM Venda v")
})
public class Venda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int nota;

	@Column(name="total_da_venda")
	private double totalDaVenda;
	
	@ManyToMany(cascade = { CascadeType.PERSIST , CascadeType.MERGE })
	@JoinTable(name="venda_livro",
	joinColumns = @JoinColumn(name="venda_id"), inverseJoinColumns = @JoinColumn(name="livro_id")
	)
	private List<Livro> livroLista;

	public Venda() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNota() {
		return this.nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public double getTotalDaVenda() {
		return this.totalDaVenda;
	}

	public void setTotalDaVenda(double d) {
		this.totalDaVenda = d;
	}

	public List<Livro> getLivroLista() {
		return livroLista;
	}

	public void setLivroLista(List<Livro> livroLista) {
		this.livroLista = livroLista;
	}

}