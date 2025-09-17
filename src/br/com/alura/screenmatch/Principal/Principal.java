package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);

        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("duracao do filme " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);

        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorTemporada(50);

        lost.exibeFichaTecnica();
        System.out.println("duracao das temporadas  " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);

        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("tamanho da lista " + listaDeFilmes.size());
        System.out.println("primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString " + listaDeFilmes.get(0).toString());
    }
}