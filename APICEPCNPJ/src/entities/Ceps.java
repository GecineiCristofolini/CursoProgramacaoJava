package entities;



public class Ceps {
	
    private String cep;
    private String logradouro;
     private String bairro;
    private String localidade;
    private String uf;
    private String ddd;
    private String ibge;
    private String gia;
    private String tipologradouro;
	
    public Ceps() {
    	
    }
    public Ceps(String cep, String logradouro, String complemento, String bairro, String localidade, String uf,
			String ddd, String ibge, String gia, String tipologradouro) {


		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.ddd = ddd;
		this.ibge = ibge;
		this.gia = gia;
		this.tipologradouro = tipologradouro;
	}
    
    
    
    
}    