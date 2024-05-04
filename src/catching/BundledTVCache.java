package catching;

import java.util.HashMap;
import java.util.Map;

import tv.Canal;
import tv.CanalLivre;
import tv.CanalPago;

public class BundledTVCache {
    private Map<String, Canal> cache = new HashMap<>();

    public BundledTVCache() {
        CanalLivre canalLivre = new CanalLivre();
        canalLivre.genero = "comédia";
        canalLivre.faixaEtaria = "Livre";
        canalLivre.avaliacao = "Muito engraçado";
        canalLivre.nome = "Comedy Central";

        CanalPago canalPago = new CanalPago();
        canalPago.genero = "terror";
        canalPago.faixaEtaria = "18 anos";
        canalPago.avaliacao = "Canal de terror premium";
        canalPago.nome = "Terror TV"; 

        cache.put("Canal de Comédia", canalLivre);
        cache.put("Canal de Terror", canalPago);
    }

    public Canal put(String key, Canal canal) {
        cache.put(key, canal);
        return canal;
    }

    public Canal get(String key) {
        return cache.get(key).clone();
    }
}
