package chapter1.section1;

public class ex29 {
    /*1.1.29 Add to BinarySearch a static method rank() that takes a sorted array of int values (some of which may be equal)
    * and a key as arguments and returns the number of elements that are smaller than the key and a similar method count() that returns
    * the number of elements equal to the key.
    * Note: If i and j are the values returned by rank(a, key) and count(a, key) respectively, then a[i..i+j-1] are the values in the array that are equal to key.*/
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 9, 12, 33, 33, 33, 33, 33, 33, 99, 99, 99, 99};
        //System.out.println(indexOf(arr, 12));
        System.out.println(rank(arr, 12));
        System.out.println(count(arr, 12));
    }

    public static int indexOf(int[] a, int key){
        return indexOf(a, key, 0, a.length -1);
    }

    public static int indexOf(int[] a, int key, int lo, int hi){
        if (lo > hi){
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        if(key < a[mid]){
            return indexOf(a, key, lo, mid - 1);
        }
        else if (key > a[mid]){
            return indexOf(a, key, mid + 1, hi);
        }
        else{
            return mid;
        }
    }

    public static int rank(int[] a, int key){
        return rank(a, key, 0, a.length -1);
    }
    public static int rank(int[]a , int key, int lo, int hi){
        int lowerIndex = indexOf(a, key, lo, hi);

        if(lowerIndex == 0){
            return 0;
        }
        else if(lowerIndex == -1){
            return -1;
        }
        else if(a[lowerIndex - 1] == key){
            return rank(a, key, lo, lowerIndex - 1);
        }
        else{
            return lowerIndex;
        }

    }

    public static int count(int[] a, int key){
        return count(a, key, 0, a.length -1);
    }
    public static int count(int[]a , int key, int lo, int hi){
        int counter = 0;
        int lowerIndex = rank(a, key, lo, hi);

        if(lowerIndex == -1){
            return -1;
        }

        while(a[lowerIndex] == key){
            counter++;
            lowerIndex += 1;
            if(lowerIndex == a.length){
                return counter;
            }
        }

        return counter;
    }
}
