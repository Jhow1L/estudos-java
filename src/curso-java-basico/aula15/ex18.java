package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex18 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        int dia, mes, ano;
        String data;

        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        data = scan.nextLine();

        String[] datas = data.split("/");

        dia = Integer.parseInt(datas[0]);
        mes = Integer.parseInt(datas[1]);
        ano = Integer.parseInt(datas[2]);

        if (dia >= 1 && dia <= 31){
            if (mes >= 1 && mes <= 12){
                if (ano >= 0 & ano <= 9999){
                    System.out.println("Data válida.");
                }
            }
        }
        else {
            System.out.println("Data inválida!");
        }


    }
}
