package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the autores database table.
 * 
 */
@Entity
@NamedQuery(name="Autores.findAll", query="SELECT a FROM Autores a")
public class Autores implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String nome;

	//bi-directional many-to-one association to Livro
	@OneToMany(mappedBy="autor")
	private List<Livro> livros;

	public Autores() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Livro> getLivros() {
		return this.livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Livro addLivro(Livro livro) {
		getLivros().add(livro);
		livro.setAutore(this);

		return livro;
	}

	public Livro removeLivro(Livro livro) {
		getLivros().remove(livro);
		livro.setAutore(null);

		return livro;
	}

}