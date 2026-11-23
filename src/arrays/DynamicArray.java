package arrays;
import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            arr.add(i * 5);
        }

        System.out.println("initial arrays: " + arr);

        arr.remove(12);
        arr.remove(10);

        System.out.println("After removal " + arr);

        int index = arr.indexOf(40);

        if (index != -1){
            arr.set(index, 100);
        }
        System.out.println("After Update: " + arr);

        arr.add(20);
        arr.add(30);

        System.out.println("The final array: " + arr);
    }
}
