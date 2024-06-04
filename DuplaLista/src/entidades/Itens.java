package entidades;

import java.util.List;

public class Itens {
	
	private String descrica;
	private String ferramenta;
	private String Cor;
	private String ncm;
	private Double valor;
	public Itens(String descrica, String ferramenta, String cor, String ncm, Double valor) {
		super();
		this.descrica = descrica;
		this.ferramenta = ferramenta;
		Cor = cor;
		this.ncm = ncm;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "descrica=" + descrica + ", ferramenta=" + ferramenta + ", Cor=" + Cor + ", ncm=" + ncm
				+ ", valor=" + valor;
	}
	public String getDescrica() {
		return descrica;
	}
	public void setDescrica(String descrica) {
		this.descrica = descrica;
	}
	public String getFerramenta() {
		return ferramenta;
	}
	public void setFerramenta(String ferramenta) {
		this.ferramenta = ferramenta;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getNcm() {
		return ncm;
	}
	public void setNcm(String ncm) {
		this.ncm = ncm;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
}
