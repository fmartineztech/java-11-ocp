
public class ForLoop1 {

    public static void main(String[] args) {


        int x = 0;

        for (long y = 0, z = 4; x < 5 && y < 10; x++, y ++) {
            System.out.println(y + " y " + z);
        }

        System.out.println(x + " x");


//        int x = 0;
//        for(int x = 4; x < 5; x++) { // DOES NOT COMPILE
//            System.out.print(x + " ");
//        }
//        int x = 0;
//        for(x = 4; x < 5; x++) {
//            System.out.print(x + " ");
//        }

//        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
//            System.out.print(y + " ");
//        }
//        System.out.print(x); // DOES NOT COMPILE
    }
}
