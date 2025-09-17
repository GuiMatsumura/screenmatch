package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Serie lost = new Serie("Lost", 2000);
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(10);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Guilherme");
        buscaPorArtista.add("Duda");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Ordenada");
        System.out.println(buscaPorArtista);
        System.out.println("Lista ordenada");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Por ano");
        System.out.println(lista);
    }
}
