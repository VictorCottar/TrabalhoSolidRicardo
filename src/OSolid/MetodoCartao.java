package OSolid;

public class MetodoCartao implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Cartão.");
    }
}