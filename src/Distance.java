public class Distance {
    public static void main(String args[]){
        //  x- and y-coordinates from command-line arguments
        int x = 2;
        int y = 1;

        // compute distance to (2, 1)
        double dist = Math.sqrt(x*x + y*y);

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (2, 1) = " + dist);
    }
}

