package cursojavabasico.aula37_43.exercicios.ex01;

public class Main {
    public static void main(String[] args) {

        loaine.cursojavabasico.aula37_43.exercicios.ex01.ContaBancaria conta1 = new loaine.cursojavabasico.aula37_43.exercicios.ex01.ContaBancaria();
        loaine.cursojavabasico.aula37_43.exercicios.ex01.ContaPoupanca conta2 = new loaine.cursojavabasico.aula37_43.exercicios.ex01.ContaPoupanca(0.67);
        loaine.cursojavabasico.aula37_43.exercicios.ex01.ContaEspecial conta3 = new loaine.cursojavabasico.aula37_43.exercicios.ex01.ContaEspecial(500);

        conta1.setNumConta("09904");
        conta1.setNomeCliente("Jhonatan");
        conta1.setSaldo(100);

        conta2.setNumConta("09905");
        conta2.setNomeCliente("Joao");
        conta2.setSaldo(300);

        conta3.setNumConta("09906");
        conta3.setNomeCliente("Jessica");
        conta3.setSaldo(0);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3 + "\n");

        System.out.printf((conta1.sacar(110) ? "Saque efetuado com sucesso.\n" : "Saque não efetuado por falta de saldo.\n"));
        System.out.printf((conta2.sacar(50) ? "Saque efetuado com sucesso.\n" : "Saque não efetuado por falta de saldo.\n"));
        System.out.printf((conta3.sacar(510) ? "Saque efetuado com sucesso.\n" : "Saque não efetuado por falta de saldo.\n"));

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3 + "\n");

        conta1.depositar(500);
        conta2.depositar(500);
        conta3.depositar(500);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3 + "\n");

        conta2.calcularNovoSaldo();
        System.out.println(conta2);


    }
}
