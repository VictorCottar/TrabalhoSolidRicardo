package OSolid;

public class MetodoBoleto implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Boleto.");
    }
}
