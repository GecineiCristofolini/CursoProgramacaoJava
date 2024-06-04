package aplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Stream;

import entidades.Documentos;
import entidades.Itens;
import entidades.ListaDocumentos;

public class Program {

	public static void main(String[] args) {

		Itens itensped = new Itens("Cierro", "TECNO", "BLANCO", "39162000", 20.30);
		Itens itensped1 = new Itens("EMENDA", "EMENDA U", "BLANCO", "39162010", 5.00);
		Itens itensped2 = new Itens("Arremate", "ARREMATE U", "BLANCO", "39162010", 3.00);

		List<Itens> listaitens = new ArrayList<>();
		listaitens.add(itensped);
		listaitens.add(itensped1);
		listaitens.add(itensped2);

		List<Documentos> listado = new ArrayList<>();

		Set<String> listancm = new HashSet<>();

		for (Itens Itens : listaitens) {
			listancm.add(Itens.getNcm());

		}

		for (String e : listancm) {

			String ncm = e;
			BigDecimal Valor = new BigDecimal(0);

			System.out.println(ncm);

			for (Itens Itens2 : listaitens) {

				if (ncm == Itens2.getNcm() ){

				

					Documentos doc = new Documentos();
					doc.setDescridocumentos(Itens2.getDescrica());
					doc.setFerramenta(Itens2.getFerramenta());
					doc.setCor(Itens2.getCor());
					doc.setNcmdoc(Itens2.getNcm());

					listado.add(doc);
					

				}
       
			}
         
			System.out.println(listado.toString());
			
			
		}

	}

}
