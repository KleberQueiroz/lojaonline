package lojaOnLine.modelo;

import java.io.Serializable;

import javax.xml.crypto.Data;

public class Venda implements Serializable{

	private int idVenda;
	private Data dataVenda;
	private Cliente cliente;
	
	public Venda() {
	}

	public Venda(int idVenda, Data dataVenda, Cliente cliente) {
		this.idVenda = idVenda;
		this.dataVenda = dataVenda;
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idVenda;
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
		Venda other = (Venda) obj;
		if (idVenda != other.idVenda)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Venda [idVenda=" + idVenda + "]";
	}
	
	 
}
