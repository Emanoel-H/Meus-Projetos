package LivrariaOnline.Domain;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    private String autor;
    private String titulo;
    private double valor;

    public Livro(String autor, String titulo, double valor) {
        this.autor = autor;
        this.titulo = titulo;
        this.valor = valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " Autor: " + autor + " Preço: " + valor;
    }
}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getValor(), l2.getValue().getValor());
    }
}

class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
}
