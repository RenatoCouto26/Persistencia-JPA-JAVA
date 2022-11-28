package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQueries({
//@NamedQuery(name="Usuario.findall", query="SELECT u FROM Usuario u"),
@NamedQuery(name="Usuario.findbynome", query="SELECT u FROM Usuario u where u.nome LIKE :nome"),
@NamedQuery(name="Usuario.findbycpf", query="SELECT u FROM Usuario u where u.id.cpf = :cpf"),
})

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuarioPK id;

	private String nome;

	public Usuario() {
	}

	public Usuario(UsuarioPK id, String nome) {
		this.id=id;
		this.nome=nome;
	}

	//teste de retorno do cpf 
	public String getIdcpf() {
		return this.id.getCpf();
	}
	
	public UsuarioPK getId() {
		return this.id;
	}

	public void setId(UsuarioPK id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + "]";
	}

}