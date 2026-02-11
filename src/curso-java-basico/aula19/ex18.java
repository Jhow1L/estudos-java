package loaine.cursojavabasico.aula19;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++){
            System.out.printf("Digite a idade do %d° membro do grupo: ", i + 1);
            idades[i] = scan.nextInt();
        }

        int maior = 0, menor = 0;

        for (int i = 1; i < idades.length; i++){
            if (idades[i] >= idades[maior]){
                maior = i;
            }
            if (idades[i] <= idades[menor]){
                menor = i;
            }
        }

        System.out.printf("Desse grupo o mais velho é o %d° membro (%d anos)  e o mais novo é o %d° membro (%d anos)", maior + 1, idades[maior], menor + 1, idades[menor]);
    }
}
