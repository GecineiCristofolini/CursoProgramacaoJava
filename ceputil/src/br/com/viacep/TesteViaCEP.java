package br.com.viacep;
import java.io.IOException;

public class TesteViaCEP {
    public static void main(String[] args) throws IOException {
        
        System.out.println(br.com.viacep.ClienteWs.getEnderecoPorCep("70002900"));
        System.out.println(br.com.viacep.ClienteWs.getMapPorCep("70002900"));

        
    }
}
