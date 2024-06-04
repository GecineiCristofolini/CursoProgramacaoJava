package entidades;

import java.util.Objects;

public class Documentos {
	
	private String descridocumentos;
	private String Ferramenta;
	private String Cor;
	private String ncmdoc;
	
	
	public Documentos() {
		
	}

	public String getDescridocumentos() {
		return descridocumentos;
	}

	public void setDescridocumentos(String descridocumentos) {
		this.descridocumentos = descridocumentos;
	}

	public String getFerramenta() {
		return Ferramenta;
	}

	public void setFerramenta(String ferramenta) {
		Ferramenta = ferramenta;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getNcmdoc() {
		return ncmdoc;
	}

	public void setNcmdoc(String ncmdoc) {
		this.ncmdoc = ncmdoc;
	}

	@Override
	public String toString() {
		return "descridocumentos=" + descridocumentos + ", Ferramenta=" + Ferramenta + ", Cor=" + Cor
				+ ", ncmdoc=" + ncmdoc + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ncmdoc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documentos other = (Documentos) obj;
		return Objects.equals(ncmdoc, other.ncmdoc);
	}

	

	

	
	
	
	
}