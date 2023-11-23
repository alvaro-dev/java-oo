package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1978);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost",2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Rocha");
        buscaPorArtista.add("Luiz");
        buscaPorArtista.add("Alvaro");
        buscaPorArtista.add("Ciclano");
        buscaPorArtista.add("Beltrano");
        buscaPorArtista.add("Fulano");
        System.out.println("Antes da Ordenação : " + buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de Filmes Ordenadas: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por Ano: " + lista);

    }

}
