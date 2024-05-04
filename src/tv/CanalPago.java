package tv;

public class CanalPago extends Canal {
    public CanalPago() {
    }

    public CanalPago(CanalPago target) {
        super(target);
    }

    @Override
    public Canal clone() {
        return new CanalPago(this);
    }
}
