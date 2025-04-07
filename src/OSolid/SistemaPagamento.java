package OSolid;

public class SistemaPagamento {

    public void realizarPagamento(double valor, MetodoPagamento sistemaPagamentos) {
        sistemaPagamentos.pagar(valor);
    }
}