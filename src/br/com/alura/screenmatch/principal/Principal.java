package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;
import java.util.Objects;

public class Principal {
    public static void main(String[] args){
        var meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        var toyStory = new Filme("Toy Story", 1999);
        toyStory.setDuracaoEmMinutos(180);

        var filme3 = new Filme("Dogville", 2003);
        filme3.setDuracaoEmMinutos(200);
        filme3.avalia(10);

        Serie twd = new Serie("The Walking Dead", 2009);
        twd.setTemporadas(11);
        twd.setEpisodiosPorTemporada(16);
        twd.setMinutosPorEpisodio(50);

        var calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(toyStory);
        calculadora.inclui(twd);
        System.out.println(calculadora.getTempoTotal());

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(3);

        var filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        var ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(twd);
        ep.setTotalViews(20);
        filtro.filtra(ep);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(toyStory);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        ArrayList<Serie> series = new ArrayList<>();

    }
}
