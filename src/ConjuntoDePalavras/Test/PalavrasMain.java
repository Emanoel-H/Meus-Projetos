package ConjuntoDePalavras.Test;

import ConjuntoDePalavras.Domain.ConjuntoPalavrasUnicas;


public class PalavrasMain {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cp = new ConjuntoPalavrasUnicas();

        cp.adicionarPalavra("Java");
        cp.adicionarPalavra("C++");
        cp.adicionarPalavra("Python");
        cp.adicionarPalavra("Ruby");

        cp.removerPalavra("Python");

        System.out.println(cp.verificarPalavra("Python"));

        cp.exibirPalavrasUnicas();
    }
}
