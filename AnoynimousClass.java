package ro.java.ctrln;

public class AnoynimousClass {
    public static void main(String[] args) {

        Starship starship = new Starship() {
            @Override
            public void warp() {
                System.out.println("Anoynous class Warp !!!");
            }

            @Override
            public void setStarshipDestination(String destination) {
                System.out.println("Fly to " + destination);
            }

            @Override
            public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
                return warpFactor * lightYearsToDestination;
            }
        };
        starship.warp();
        starship.setStarshipDestination("Mars");
        System.out.println("Warp speed is: " + starship.computeWarpSpeed(3,1000));
    }
}
