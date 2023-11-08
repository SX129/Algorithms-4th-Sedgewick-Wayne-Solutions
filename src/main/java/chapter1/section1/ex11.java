package chapter1.section1;

public class ex11 {
    /*1.1.11 Write a code fragment that prints the contents of a two-dimensional boolean array,
    * using '*' to represent true and a space to represent false. Include row and column numbers. */
    public static void main(String[] args){
        Boolean[][] myBooleanArray = {
                {true, false, true, false},
                {false, true, false, true},
                {true, false, true, false},
                {true, true, true, true},
        };

        twoDArray(myBooleanArray);
    }

    public static void twoDArray(Boolean[][] arr){
        for(int k = 1; k < arr[0].length+1; k++){
            if (k == 1){
                System.out.print("   ");
            }
            System.out.print("C-" + k + " ");
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print("\nR-" + (i+1));

            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j]){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
                System.out.print("  ");
            }

        }
    }
}
