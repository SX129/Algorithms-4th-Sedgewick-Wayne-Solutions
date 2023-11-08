package chapter1.section1;

public class ex5 {
    /*1.1.5 Write a code fragment that prints true if the double variables x and y are both
    * strictly between 0 and 1, and false otherwise.*/
    public static void main(String[] args){
        isStrictlyBetween(0.1, 1);
        isStrictlyBetween(0.6, 0.9);
        isStrictlyBetween(-0.2, 0.2);
    }

    public static void isStrictlyBetween(double x, double y){
        if(x > 0 && x < 1 && y > 0 && y < 1){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
