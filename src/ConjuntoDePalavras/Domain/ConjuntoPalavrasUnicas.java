package ConjuntoDePalavras.Domain;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavras.isEmpty()){
            System.out.println(palavras);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirMenu(){
        System.out.println("=================================================");
        System.out.println("                  PALAVRAS ÚNICAS                ");
        System.out.println("Insira o número da ação que você deseja realizar:");
        System.out.println("\n1- Exibir palavras únicas \n2- Adicionar palavra" +
                " \n3- Remover palavra \n4- Verificar palavra \n9- Sair");
        System.out.println("=================================================");
    }


}
