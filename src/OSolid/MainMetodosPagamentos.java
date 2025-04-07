package OSolid;

public class MainMetodosPagamentos{
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        MetodoPagamento cartao = new MetodoCartao();
        MetodoPagamento pix = new MetodoPix();
        MetodoPagamento boleto = new MetodoBoleto();

        sistema.realizarPagamento(100.0, cartao);
        sistema.realizarPagamento(50.0, pix);
        sistema.realizarPagamento(200.0, boleto);
    }
}
