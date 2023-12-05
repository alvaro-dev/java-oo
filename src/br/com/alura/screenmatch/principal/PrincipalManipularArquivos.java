package br.com.alura.screenmatch.principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PrincipalManipularArquivos {
    public static void main(String[] args) {
        try {
            File arquivo = new File("/home/alvaro/filmes.txt");
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
        /*
        System.out.println("Inicio Leitura");
        FileReader linha = new FileReader("/home/alvaro/filmes.txt");
        int data = linha.read();
        System.out.println("Imprimindo em tela");
        while (data != -1) {
            System.out.print((char) data);
            data = linha.read();
        }
        linha.close();
        System.out.println();
        System.out.println("Fim Leitura");
        */
    }
}
