package OSolid;

public class MetodoPix implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }

}
