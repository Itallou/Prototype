package cache;

import catching.BundledTVCache;
import tv.Canal;

public class Demo {
    public static void main(String[] args) {
        BundledTVCache cache = new BundledTVCache();

        Canal canal1 = cache.get("Canal de Comédia");
        Canal canal2 = cache.get("Canal de Terror");
        Canal canal3 = cache.get("Canal de Terror");

        if (canal1 != canal2 && !canal1.equals(canal2)) {
            System.out.println("Canal de Comédia != Canal de Terror (yay!)");
        } else {
            System.out.println("Canal de Comédia == Canal de Terror (booo!)");
        }

        if (canal2 != canal3) {
            System.out.println("Canais de terror são dois objetos diferentes (yay!)");
            if (canal2.equals(canal3)) {
                System.out.println("Eles são idênticos (yay!)");
            } else {
                System.out.println("Mas eles não são idênticos (booo!)");
            }
        } else {
            System.out.println("Gêneros de canal são iguais (booo!)");
        }
    }
}
