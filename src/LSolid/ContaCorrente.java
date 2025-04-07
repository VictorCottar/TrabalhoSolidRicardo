package LSolid;

public class ContaCorrente extends ContaBancaria implements IContaComSaque {

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }
        saldo -= valor;
    }
}
