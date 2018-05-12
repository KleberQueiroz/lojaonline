package lojaOnLine.modelo;

import java.io.Serializable;

public class Cliente implements Serializable {

	private int idCliente;
	private String nome;
	private String sobrenome;
	
	public Cliente() {
	}

	public Cliente(int idCliente, String nome, String sobrenome) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCliente;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (idCliente != other.idCliente)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente  idCliente=" + idCliente + ", nome=" + nome ;
	}
	
	 
}
