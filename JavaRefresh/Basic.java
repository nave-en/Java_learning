import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Basic {
    public static void main(String[] args) {
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        hm.put(0, new HashSet<>());
        hm.get(0).add(1);
        hm.get(0).add(2);
        System.out.println(hm.get(0));
        // System.out.println("Hello World");
        // final int a = 10;
        // System.out.println("Variable A : " + a);
        // int []arr = new int[10];
        // arr[0] = 1;
        // System.out.println(Arrays.toString(arr));
        // int []brr = {1, 2, 3};
        // System.out.println(Arrays.toString(brr));
        // System.out.println("Length of the array : " + brr.length);
        // for (int i : brr) {
        //     System.out.println(i);
        // }

        // int []crr = {1, 2, 3};
        // int[] drr = modifyArray(crr);
        // System.out.println(Arrays.toString(crr));
        // System.out.println(Arrays.toString(drr));
    }
    // public static int[] modifyArray(int[] arr) {
    //     arr[0] = 10;

    //     return arr;
    // }
}

