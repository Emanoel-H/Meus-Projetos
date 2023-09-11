package OrdenacaoDeNumeros.Domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numeros;

    public OrdenacaoNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numeros);
        numerosDescendente.sort(Collections.reverseOrder());
        return numerosDescendente;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }
}
