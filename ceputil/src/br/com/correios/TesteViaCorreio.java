package br.com.correios;
import java.io.IOException;

public class TesteViaCorreio {
    public static void main(String[] args) throws IOException {
        System.out.println(br.com.correios.ClienteWs.getEnderecoPorCep("70002900"));
        System.out.println(br.com.correios.ClienteWs.getMapPorCep("70002900"));

    }
}
