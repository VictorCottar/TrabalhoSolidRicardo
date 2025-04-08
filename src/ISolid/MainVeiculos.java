package ISolid;

public class MainVeiculos {

    public static void main(String[] args) {
        // Veículo terrestre
        VeiculoTerrestre carro = new Carro();
        carro.dirigir();

        // Veículo aéreo
        VeiculoAereo aviao = new Aviao();
        aviao.voar();

        // Veículo aquático
        VeiculoAquatico barco = new Jetski();
        barco.navegar();
    }


}
