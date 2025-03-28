import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Display the array list");
        System.out.println(names.toString());
        // add the super star to the array list
        names.add("super star");
        System.out.println(names.toString());
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3));
        System.out.println(al);
        List<Integer> res = al.stream().distinct().collect(Collectors.toList());
        System.out.println(res);
    }
}
