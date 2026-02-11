package loaine.cursojavabasico.aula27;

public class ContaCorrente {

    String numero;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;

    boolean realizarSaque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            if (especial) {
                if (limiteEspecial - saldo >= valor) {
                    saldo -= valor;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    double consultarSaldo() {
        return saldo;
    }

    boolean chequeEspecial() {
        return saldo < 0;
    }


}
