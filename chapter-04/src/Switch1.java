public class Switch1 {
    public static void main(String args[]) {

        int dayOfWeek = 0;

        switch(dayOfWeek) {
            case 5:
                System.out.println("hola lala");
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
            case 6:
                System.out.println("Saturday");
                return;
        }
    }
}
