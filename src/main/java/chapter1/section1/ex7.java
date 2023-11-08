package chapter1.section1;

public class ex7 {
    /*1.1.7 Give the value printed by each of the following code fragments:*/
    public static void main(String[] args){
        //Fragment a
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > 0.001){
            t = (9.0/t + t) / 2.0; //5.0
        }
        System.out.printf("%.5f\n", t);
        //3.00009


        //Fragment b
        int sumB = 0;
        for (int i = 1; i < 1000; i++){
            for (int j = 0; j < i; j++){
                sumB++;
            }
        }
        System.out.println(sumB);
        //499500


        //Fragment C
        int sumC = 0;
        for (int i = 1; i < 1000; i *= 2){
            for (int j = 0; j < 1000; j++){
                sumC++;
            }
        }
        System.out.println(sumC);
        //10000
    }
}
