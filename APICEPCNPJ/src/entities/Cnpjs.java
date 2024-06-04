package entities;



public class Cnpjs {
	
    private String razao_social;
    private String nome_fantasia;
    private String logradrouro;
    private String numero;
    private String bairro;
    private String cep;
    private String estado;
    private String municipio;
    private String situcao;
    private String tipo_logradouro; 
    private String inscricao_estadual;
    
    public Cnpjs () {
    	
    }

	public Cnpjs(String razao_social, String nome_fantasia, String logradrouro, String numero, String bairro,
			String cep, String estado, String municipio, String situcao, String tipo_logradouro,String inscricao_estadual  ) {
		
		this.razao_social = razao_social;
		this.nome_fantasia = nome_fantasia;
		this.logradrouro = logradrouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.estado = estado;
		this.municipio = municipio;
		this.situcao = situcao;
		this.tipo_logradouro = tipo_logradouro;
		this.inscricao_estadual = inscricao_estadual;
	}

	public String getInscricao_estadual() {
		return inscricao_estadual;
	}

	public void setInscricao_estadual(String inscricao_estadual) {
		this.inscricao_estadual = inscricao_estadual;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getNome_fantasia() {
		
		
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getLogradrouro() {
		return logradrouro;
	}

	public void setLogradrouro(String logradrouro) {
		this.logradrouro = logradrouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getSitucao() {
		return situcao;
	}

	public void setSitucao(String situcao) {
		this.situcao = situcao;
	}
	
	

	public String getTipo_logradouro() {
		return tipo_logradouro;
	}

	public void setTipo_logradouro(String tipo_logradouro) {
		this.tipo_logradouro = tipo_logradouro;
	}

	@Override
	public String toString() {
		return "razao_social= " + razao_social + "\n" 
				+ "nome_fantasia= " + nome_fantasia + "\n"
				+ "numero= " + numero + "\n"
				+ "inscricao_estadual= " + inscricao_estadual + "\n"
				+ "situcao= " + situcao;
		        
	}
   
 	
    
}
   