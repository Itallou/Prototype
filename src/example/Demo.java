package example;

import java.util.ArrayList;
import java.util.List;

import tv.Canal;
import tv.CanalLivre;
import tv.CanalPago;

public class Demo {
    public static void main(String[] args) {
        List<Canal> canais = new ArrayList<>();
        List<Canal> canaisCopy = new ArrayList<>();

        CanalLivre canalLivre = new CanalLivre();
        canalLivre.genero = "comédia";
        canalLivre.faixaEtaria = "Livre";
        canalLivre.avaliacao = "Canal engraçado";
        canalLivre.nome = "Comedy Central";
        canais.add(canalLivre);

        CanalLivre outroCanalLivre = (CanalLivre) canalLivre.clone();
        canais.add(outroCanalLivre);

        CanalPago canalPago = new CanalPago();
        canalPago.genero = "terror";
        canalPago.faixaEtaria = "18 anos";
        canalPago.avaliacao = "Canal de terror premium";
        canalPago.nome = "Terror TV"; 
        canais.add(canalPago);

        cloneAndCompare(canais, canaisCopy);
    }

    private static void cloneAndCompare(List<Canal> canais, List<Canal> canaisCopy) {
        for (Canal canal : canais) {
            canaisCopy.add(canal.clone());
        }

        for (int i = 0; i < canais.size(); i++) {
            if (canais.get(i) != canaisCopy.get(i)) {
                System.out.println(i + ": Canais são diferentes (yay!)");
                if (canais.get(i).equals(canaisCopy.get(i))) {
                    System.out.println(i + ": Eles são idênticos (yay!)");
                } else {
                    System.out.println(i + ": Mas eles não são idênticos (booo!)");
                }
            } else {
                System.out.println(i + ": Gêneros de canal são iguais (booo!)");
            }
        }
    }
}
