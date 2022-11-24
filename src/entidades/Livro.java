package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the livros database table.
 * 
 */
@Entity
@Table(name="livros")
@NamedQuery(name="Livro.findAll", query="SELECT l FROM Livro l")
public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="data_de_lancamento")
	private Date dataDeLancamento;

	private String nome;

	private BigDecimal preco;

	//bi-directional many-to-one association to Autores
	@ManyToOne
	@JoinColumn(name="autores_id")
	private Autores autor;

	public Livro() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataDeLancamento() {
		return this.dataDeLancamento;
	}

	public void setDataDeLancamento(Date dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Autores getAutore() {
		return this.autor;
	}

	public void setAutore(Autores autore) {
		this.autor = autore;
	}

}