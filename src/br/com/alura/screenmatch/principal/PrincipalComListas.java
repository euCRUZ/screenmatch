package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        var meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(6);
        var toyStory = new Filme("Toy Story", 1999);
        toyStory.avalia(9);
        var filme3 = new Filme("Dogville", 2003);
        filme3.avalia(3);
        var twd = new Serie("The Walking Dead", 2009);

        Filme f1 = filme3;

        List<Titulo> lista = new ArrayList<>();
        lista.add(filme3);
        lista.add(meuFilme);
        lista.add(toyStory);
        lista.add(twd);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Tom Cruise");
        buscaArtista.add("Jack Black");
        System.out.println(buscaArtista);
        Collections.sort(buscaArtista);
        System.out.println(buscaArtista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + lista);
    }
}
