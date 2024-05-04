package tv;

public class CanalLivre extends Canal {
    public CanalLivre() {
    }

    public CanalLivre(CanalLivre target) {
        super(target);
    }

    @Override
    public Canal clone() {
        return new CanalLivre(this);
    }
}
