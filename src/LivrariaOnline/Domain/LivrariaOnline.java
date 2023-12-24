package LivrariaOnline.Domain;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livrariaMap.put(link, livro);
    }

    public void removerLivro (String titulo){
        List<String> livroParaRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                livroParaRemover.add(entry.getKey());
            }
        }

        for (String chave : livroParaRemover){
            livrariaMap.remove(chave);
        }

    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrariaMap.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor){
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivroPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.put(entry.getKey(), entry.getValue());
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro(){
     List<Livro> livrosMaisCaros = new ArrayList<>();
     double precoMaisAlto = Double.MIN_VALUE;

     if (!livrariaMap.isEmpty()){
         for (Livro livro : livrariaMap.values()){
             if (livro.getValor() > precoMaisAlto){
                precoMaisAlto = livro.getValor();
             }
         }
     } else {
         throw new NoSuchElementException("A livraria está vazia!");
     }

     for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
        if(entry.getValue().getValor() == precoMaisAlto){
            Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
            livrosMaisCaros.add(livroComPrecoMaisAlto);
        }
     }

     return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato(){
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livrariaMap.isEmpty()){
            for (Livro livro : livrariaMap.values()){
                if (livro.getValor() < precoMaisBaixo){
                    precoMaisBaixo = livro.getValor();
                }
            }
        } else{
            throw new NoSuchElementException("A livraria está vazia");
        }

        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if (entry.getValue().getValor() == precoMaisBaixo){
                Livro livroComPrecoMaisBaixo = livrariaMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }

    public Map<String, Livro> getLivrariaMap() {
        return livrariaMap;
    }
}
