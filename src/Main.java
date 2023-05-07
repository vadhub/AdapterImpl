public class Main {
    public static void main(String[] args) {
        //He (heli) =  0.004 kg/mol p = 0.17847
        //H = 0.00100784 kg/mol р = 0,09
        //Azot = 0,028 kg/mol р = 1,25046
        //propan = 44,097 p = 2,019

        AdapterBalloon balloonWithPropan = new AdapterBalloon(20, 20*2.019, 44.094/1000);

        System.out.println(balloonWithPropan.passport());
        System.out.println(balloonWithPropan.getPressure(12) +" kPa pressure");
        System.out.println(balloonWithPropan.amountOfMatter() + "kg amount Of Matter");
        System.out.println("change on " + balloonWithPropan.getDp(12, 100) +" kPa");
        System.out.println();
        balloonWithPropan.modifyVolume(100);
        System.out.println(balloonWithPropan.passport());

    }
}