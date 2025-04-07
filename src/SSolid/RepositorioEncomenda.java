package SSolid;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RepositorioEncomenda {
    private String arquivo = "encomendas.txt";

    public void salvar(Encomenda encomenda) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
            bw.write("ID: " + encomenda.getId() + " - Frete: " + encomenda.getValorFrete());
            bw.newLine();
            System.out.println("Encomenda salva no arquivo " + arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
