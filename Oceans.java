package ro.java.ctrln;

import javax.imageio.ImageReader;

public enum Oceans {
    ARCTIC(5450),
    ANTARCTIC(7236),
    ATLANTIC(8486),
    INDIAN(8947),
    PACIFIC(11022);

    public final int maximumDepth;
     Oceans(int maximumDepth){
        this.maximumDepth=maximumDepth;
    }

    public int getMaximumDepth(){
         return this.maximumDepth;
    }

    public static void main(String[] args) {
        for(Oceans ocean : Oceans.values()){
//            ocean.maximumDepth=10000;
            System.out.println("Adincimea maxima a oceanului " + ocean + " este " + ocean.getMaximumDepth());
        }
    }
}
