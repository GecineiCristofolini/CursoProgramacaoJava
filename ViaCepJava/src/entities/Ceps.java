package entities;



public class Ceps {
	
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ddd;
    private String ibge;
    private String gia;
	
    public Ceps() {
    	
    }
    public Ceps(String cep, String logradouro, String complemento, String bairro, String localidade, String uf,
			String ddd, String ibge, String gia) {


		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.ddd = ddd;
		this.ibge = ibge;
		this.gia = gia;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getddd() {
		return ddd;
	}
	public void setddd(String unidade) {
		this.ddd = unidade;
	}
	public String getIbge() {
		return ibge;
	}
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "Cep: " + cep.toUpperCase() + "\n"
				+ "Logradouro: "+ logradouro.toUpperCase() + "\n"
				+ "Complemento: " + complemento + "\n"
				+ "Bairro: " + bairro.toUpperCase() + "\n"
				+ "Localidade: " + localidade.toUpperCase() + "\n"
				+ "Uf: " + uf  + "\n"
				+ "DDD: " + ddd  + "\n"
				+ "Ibge: " + ibge + "\n"
				+ "Gia: " + gia +  "\n";
	}

    

}
