public class Bola implements BangunRuang {
    private int diameter;
    private final double PHI = 22.0 / 7;

    public Bola(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public double hitungLuas() {
        return PHI * diameter * diameter;
    }

    @Override
    public double hitungVolume() {
        return (PHI * diameter * diameter * diameter) / 6;
    }
}
