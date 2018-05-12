package lojaOnLine.modelo;

import java.io.Serializable;

public class Produto implements Serializable{

	private int isProduto;
	private int codigoProduto;
	private String nomeProduto;
	private double precoProduto;
	
	public Produto() {
		}

	public Produto(int isProduto, int codigoProduto, String nomeProduto, double precoProduto) {
		this.isProduto = isProduto;
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}

	public int getIsProduto() {
		return isProduto;
	}

	public void setIsProduto(int isProduto) {
		this.isProduto = isProduto;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoProduto;
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
		Produto other = (Produto) obj;
		if (codigoProduto != other.codigoProduto)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto isProduto=" + isProduto + ", nomeProduto=" + nomeProduto ;
	}
	
	
	
}
