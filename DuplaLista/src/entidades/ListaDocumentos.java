package entidades;

import java.util.List;

public class ListaDocumentos {
	
	private List<Documentos> listadocumentosd ;

	public List<Documentos> getListadocumentosd() {
		return listadocumentosd;
	}

	public void setListadocumentosd(List<Documentos> listadocumentosd) {
		this.listadocumentosd = listadocumentosd;
	}

	@Override
	public String toString() {
		return "Grupo" + listadocumentosd + "]";
	}

	

}
