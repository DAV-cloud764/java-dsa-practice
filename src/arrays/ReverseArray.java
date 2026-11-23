package arrays;

public class ReverseArray {
    public static void main(String[] args){
        int [] number = new int[5];

        number [0] = 10;
        number [1] = 20;
        number [2] = 30;
        number [3] = 40;
        number [4] = 50;

        int left = 0;
        int right = number.length - 1;

        while (left < right){
             int temp = number[left];
             number [left] = number [right];
             number [right] = number [left];

             left ++;
             right --;

        }


        System.out.print("Reversed array: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
