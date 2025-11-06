public class H3_main {

    public static void main(String[] args) {
        int max = 0, fix = 0, wartend = 0;
        boolean istVoll = false;

        System.out.println("Before:");
        System.out.println("Max " + max);
        System.out.println("Fix " + fix);
        System.out.println("Wartend" + wartend);
        System.out.println("IstVoll" + istVoll);

        if (max > fix) {
            int moveAmount = max - fix;
            if (moveAmount > wartend) {
                moveAmount = wartend;
            }
            wartend -= moveAmount;
            fix += moveAmount;

            System.out.println("MoveAmount " + moveAmount);
        }

        istVoll = fix == max;

        System.out.println("After:");
        System.out.println("Max " + max);
        System.out.println("Fix " + fix);
        System.out.println("Wartend" + wartend);
        System.out.println("IstVoll" + istVoll);
    }
}
