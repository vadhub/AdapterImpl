public class BalloonWithGas {
    private double volume;
    private final double mass;
    private final double molar;
    private final double B = 1.38*Math.pow(10, -23);
    private final double A = 6.023*Math.pow(10, 23);

    public BalloonWithGas(double volume, double mass, double molar) {
        this.volume = volume;
        this.mass = mass;
        this.molar = molar;
    }

    public double getPressure(int t) {
        double n = (A * molar) / volume;
        int kelvin = t + 273;
        return n * B * kelvin;
    }

    public double amountOfMatter() {
        return mass/molar;
    }

    @Override
    public String toString() {
        return "BalloonWithGas{" +
                "volume=" + volume +
                ", mass=" + mass +
                ", molar=" + molar +
                '}';
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
