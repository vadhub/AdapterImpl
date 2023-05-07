public class AdapterBalloon extends BalloonWithGas implements Balloon {

    public AdapterBalloon(double volume, double mass, double molar) {
        super(volume, mass, molar);
    }

    @Override
    public void modifyVolume(double dV) {
        setVolume(dV);
    }

    @Override
    public double getDp(int t0, int t1) {
        return getPressure(t1) - getPressure(t0);
    }

    @Override
    public String passport() {
        return toString();
    }
}
