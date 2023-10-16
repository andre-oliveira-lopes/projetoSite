import java.util.ArrayList;
import java.util.List;

public class ExemploColecoes {
    public static void main(String[] args) {
        // Criando uma lista de strings
        List<String> nomes = new ArrayList<>();

        // Adicionando elementos à lista
        nomes.add("\nAlice");
        nomes.add("Bob");
        nomes.add("Charlie");

        // Iterando pela lista e imprimindo os nomes
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}