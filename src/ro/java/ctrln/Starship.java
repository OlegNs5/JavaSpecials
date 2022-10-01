package ro.java.ctrln;

import java.util.Random;

public interface Starship {
    public void warp();

    public void setStarshipDestination(String destination);

    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination );

    default Double prodactionID(){
        Random r = new Random();
        return 1+2+(3 - r.nextDouble());
    }
}
