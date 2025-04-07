package SSolid;

import  java.util.Scanner;

public class ProcessadorEncomendas {
    public void processar() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            String idEncomenda = sc.nextLine();

            System.out.println("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            Encomenda encomenda = new Encomenda(idEncomenda, peso);

            CalculadoraFrete calculadora = new CalculadoraFrete();
            double valorFrete = calculadora.calcularFrete(encomenda.getPeso());
            encomenda.setValorFrete(valorFrete);

            System.out.println("Valor do frete calculado: " + valorFrete);

            RepositorioEncomenda repositorio = new RepositorioEncomenda();
            repositorio.salvar(encomenda);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ProcessadorEncomendas().processar();
    }
}
