package loaine.estruturasdados.teste;

import loaine.estruturasdados.vetor.Vetor;

public class Aula06 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");

        System.out.println(vetor.busca("elemento 1"));
    }
}
