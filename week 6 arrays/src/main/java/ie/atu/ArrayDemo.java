package ie.atu;

public class ArrayDemo {
    public static void main(String[] args) {
        //declares an array of integers
        int[] anArray;
        int x;
        int input;

        anArray = new int[10];

        for (x = 0; x < 9; x++) {
            input = (x+1) * 100;
            System.out.println("element at index " + x + ":" + input );
        }
    }
}