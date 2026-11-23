package arrays;

public class Main {
    public static void main(String[] args){
        int [] lockers = new int[4];
        lockers [0] = 10;
        lockers [1] = 20;
        lockers [2] = 30;
        lockers [3] = 40;

        System.out.println("indexed element: " + lockers[3]);

        System.out.print("Original Lockers: ");
        for (int  i = 0; i < lockers.length; i++){
            System.out.print(lockers[i] + " ");
        }

        System.out.println();

        int [] biglockers = new int[lockers.length + 1];
        for (int i = 0; i < lockers.length; i++){
            biglockers[i] = lockers[i];
        }

        biglockers [4] = 50;
        System.out.println("biglockers: " );
        for (int i = 0; i < biglockers.length; i++){
            System.out.print(biglockers[i] + " ");
        }

    }
}