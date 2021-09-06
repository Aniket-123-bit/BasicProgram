import java.lang.Math;
public class DiceTwoAdd {
    public static void main(String args[]){
        int SIDES = 6;
        //declares there 6 sides on a die and int SIDES
        int a = 1 + (int) (Math.random() * SIDES);
        //Gives the random roll to one die
        int b = 1 + (int) (Math.random() * SIDES);
        //Gives the random roll to the second die
        int sum = a + b;

        //Adds the sum of the two dice
        System.out.println(sum);
        //Prints the sum of the 2 dice
    }
    }
