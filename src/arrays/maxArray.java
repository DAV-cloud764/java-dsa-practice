package arrays;

public class maxArray {
    public static void main(String[] args){
        int [] numbers = new int[5];

        numbers[0] = 14;
        numbers[1] = 7;
        numbers[2] = 29;
        numbers[3] = 3;
        numbers[4] = 18;

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max are: " + max);
    }
}