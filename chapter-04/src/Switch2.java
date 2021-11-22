public class Switch2 {

    final int getCookies(int a) {
        return 4 + a;
    }
    final int cookies = getCookies(3);

//    void feedAnimals() {
//
//        final int bananas = 1;
//        int apples = 2;
//        int numberOfAnimals = 3;
//
//        switch (numberOfAnimals) {
//            case bananas:
//            case apples: // DOES NOT COMPILES
//            case getCookies(2): // DOES NOT COMPILE
//            case cookies : // DOES NOT COMPILE
//            case 3 * 5 :
//        }
//    }
}
