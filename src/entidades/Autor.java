package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the autor database table.
 * 
 */

//TODO implementar a consulta por nome
@Entity
@NamedQuery(name="Autor.findAll", query="SELECT a FROM Autor a")
//@NamedQuery(name="Autor.findbyname", query="SELECT a FROM Autor a")
public class Autor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String nome;

	//bi-directional many-to-one association to Livro
	@OneToMany(mappedBy="autor")
	private List<Livro> livros;

	
	
	public Autor() {
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
		livro.setAutor(this);

		return livro;
	}

	public Livro removeLivro(Livro livro) {
		getLivros().remove(livro);
		livro.setAutor(null);

		return livro;
	}

}