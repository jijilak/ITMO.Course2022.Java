package ITMO.Laboratory4;

public class Part2 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 3, 7, 5, 6, 2};
        int[] arrayB = new  int[]{1, 4, 6, 8, 9};
        P2Ex1a(arrayA);
        P2Ex1b(arrayB);
        P2Ex2();
       // P2Ex3();
       // P2Ex4();
        //P2Ex5();
        //P2Ex6();
    }

    private static void P2Ex2() {

    }

    private static void P2Ex1a(int[] arrayA) {
        boolean result = false;
        for (int i = 0; i < arrayA.length - 1; i++) {
            if (arrayA[i] < arrayA[i + 1]) {
                result = true;
            }
            else {
                result = false;
                System.out.println("Please, try again!");
                break;
            }
        }
        if (result) {
            System.out.println("OK!");
        }
    }
    private static void P2Ex1b(int[] arrayB) {
        boolean result = false;
        for (int i = 0; i < arrayB.length - 1; i++) {
            if (arrayB[i] < arrayB[i + 1]) {
                result = true;
            }
            else {
                result = false;
                System.out.println("Please, try again!");
                break;
            }
        }
        if (result) {
            System.out.println("OK!");
        }
    }
}