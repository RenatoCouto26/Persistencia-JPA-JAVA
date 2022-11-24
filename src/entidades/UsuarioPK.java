package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the usuario database table.
 * 
 */
@Embeddable
public class UsuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String cpf;

	private String email;

	
	//construtor da classe 
	public UsuarioPK() {
	}
	
	public UsuarioPK(String cpf, String email ) {
		this.cpf=cpf;
		this.email=email;
	}
	
	
	// metodos get e set 
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//---------------------------------------
	
	// Implementação de equals
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsuarioPK)) {
			return false;
		}
		UsuarioPK castOther = (UsuarioPK)other;
		return 
			this.cpf.equals(castOther.cpf)
			&& this.email.equals(castOther.email);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cpf.hashCode();
		hash = hash * prime + this.email.hashCode();
		
		return hash;
	}
}