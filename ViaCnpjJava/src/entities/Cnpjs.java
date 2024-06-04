package entities;



public class Cnpjs {
	
	private String cnpj;
    private String razao_social;
    private String nome_fantasia;
    private String numero;
    private String cep;
    private String complemento;
    private String cidade;
    private String estado;
    private String bairro;
    private String tipologradouro;
    private String logradouro;
    private String situcao;
    private String inscricao_estadual;
    
    
    
    public Cnpjs () {
    	
    }



	public Cnpjs(String cnpj, String razao_social, String nome_fantasia, String numero, String cep,
			String complemento, String cidade, String estado, String bairro, String tipologradouro,
			String logradouro, String situcao, String inscricao_estadual)
	{
		
		this.cnpj = cnpj;
		this.razao_social = razao_social;
		this.nome_fantasia = nome_fantasia;
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.bairro = bairro;
		this.tipologradouro = tipologradouro;
		this.logradouro = logradouro;
		this.situcao = situcao;
		this.inscricao_estadual = inscricao_estadual;
	}



	public String getCnpj()
	{
		return cnpj;
	}



	public void setCnpj(String cnpj)
	{
		this.cnpj = cnpj;
	}



	public String getRazao_social()
	{
		return razao_social;
	}



	public void setRazao_social(String razao_social)
	{
		this.razao_social = razao_social;
	}



	public String getNome_fantasia()
	{
		return nome_fantasia;
	}



	public void setNome_fantasia(String nome_fantasia)
	{
		this.nome_fantasia = nome_fantasia;
	}



	public String getNumero()
	{
		return numero;
	}



	public void setNumero(String numero)
	{
		this.numero = numero;
	}



	public String getCep()
	{
		return cep;
	}



	public void setCep(String cep)
	{
		this.cep = cep;
	}



	public String getComplemento()
	{
		return complemento;
	}



	public void setComplemento(String complemento)
	{
		this.complemento = complemento;
	}



	public String getCidade()
	{
		return cidade;
	}



	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}



	public String getEstado()
	{
		return estado;
	}



	public void setEstado(String estado)
	{
		this.estado = estado;
	}



	public String getBairro()
	{
		return bairro;
	}



	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}



	public String getTipologradouro()
	{
		return tipologradouro;
	}



	public void setTipologradouro(String tipologradouro)
	{
		this.tipologradouro = tipologradouro;
	}



	public String getLogradouro()
	{
		return logradouro;
	}



	public void setLogradouro(String logradouro)
	{
		this.logradouro = logradouro;
	}



	public String getSitucao()
	{
		return situcao;
	}



	public void setSitucao(String situcao)
	{
		this.situcao = situcao;
	}



	public String getInscricao_estadual()
	{
		return inscricao_estadual;
	}



	public void setInscricao_estadual(String inscricao_estadual)
	{
		this.inscricao_estadual = inscricao_estadual;
	}



	@Override
	public String toString()
	{
		return "Cnpjs [cnpj=" + cnpj + ", razao_social=" + razao_social + ", nome_fantasia="
				+ nome_fantasia + ", numero=" + numero + ", cep=" + cep + ", complemento=" + complemento
				+ ", cidade=" + cidade + ", estado=" + estado + ", bairro=" + bairro
				+ ", tipologradouro=" + tipologradouro + ", logradouro=" + logradouro + ", situcao="
				+ situcao + ", inscricao_estadual=" + inscricao_estadual + "]";
	}
    
    

}    