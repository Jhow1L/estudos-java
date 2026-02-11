package loaine.cursojavabasico.aula37_43.exercicios.ex02;

public class Main {
    public static void main(String[] args) {

        loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaFisica pessoa1 = new loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaFisica("Jhonatan", "13942", "afdad", 999, "123412");
        loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaFisica pessoa2 = new loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaFisica("Joao", "136642", "fasdgfa", 1700, "123412");
        loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaFisica pessoa3 = new loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaFisica("Jessica", "133452", "fgsdfgh", 2000, "123412");

        loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaJuridica pessoa4 = new loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaJuridica("Marcelo", "42355", "gsadfgsd", 20000, "adsfasdfadf");
        loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaJuridica pessoa5 = new loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaJuridica("Marcos", "7456", "dgjdfghh", 200000, "adsfasdfadf");
        loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaJuridica pessoa6 = new loaine.cursojavabasico.aula37_43.exercicios.ex02.PessoaJuridica("Julio", "7546345", "sfgsfg", 2000000, "adsfasdfadf");

        loaine.cursojavabasico.aula37_43.exercicios.ex02.Contribuinte[] contribuintes = new loaine.cursojavabasico.aula37_43.exercicios.ex02.Contribuinte[6];

        contribuintes[0] = pessoa1;
        contribuintes[1] = pessoa2;
        contribuintes[2] = pessoa3;
        contribuintes[3] = pessoa4;
        contribuintes[4] = pessoa5;
        contribuintes[5] = pessoa6;

        for (int i = 0; i < contribuintes.length; i++){
            contribuintes[i].calcularImposto();
        }

        for (loaine.cursojavabasico.aula37_43.exercicios.ex02.Contribuinte contribuinte : contribuintes){
            System.out.println(contribuinte.toString());;
        }





    }
}
