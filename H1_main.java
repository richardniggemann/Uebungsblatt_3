public class H1_main {

    public static void main(String[] args) {
        double guthaben = -100, monEingang = 200;
        int rating = -2;
        boolean warnhinweis = true, negativ = false;

        negativ = guthaben < 0;
        if (guthaben > 0) {
            rating += 3;
        }
        if (guthaben == 0) {
            rating += 2;
        }
        double absoluteMonIncome = Math.abs(monEingang);
        double absoluteGuthaben = Math.abs(guthaben);
        if (guthaben < 0) {
            if (guthaben < 0 && absoluteMonIncome >= absoluteGuthaben) {
                rating += 1;
            } else {
                rating -= 1;
            }
        }

        warnhinweis = (guthaben < 0) && (absoluteMonIncome < absoluteGuthaben) && (rating < 0);

        System.out.println("Guthaben " + guthaben);
        System.out.println("MonEingang " + monEingang);
        System.out.println("Rating " + rating);
        System.out.println("Warnhinweis " + warnhinweis);
        System.out.println("Negativ " + negativ);
    }
}
