package h1;

public class H1_main {

    public static void main(String[] args) {
        double guthaben = -100, monEingang = 200;
        int rating = -2;
        boolean warnhinweis = true, negativ = false;

        double absoluteMonEingang = Math.abs(monEingang);
        double absoluteGuthaben = Math.abs(guthaben);

        negativ = guthaben < 0;
        if (guthaben > 0) {
            rating += 3;
        } else if (guthaben < 0) {
            if (guthaben < 0 && absoluteMonEingang >= absoluteGuthaben) {
                rating += 1;
            } else {
                rating -= 1;
            }
        } else {
            rating += 2;
        }

        warnhinweis = (guthaben < 0) && (absoluteMonEingang < absoluteGuthaben) && (rating < 0);

        System.out.println("Guthaben " + guthaben);
        System.out.println("MonEingang " + monEingang);
        System.out.println("Rating " + rating);
        System.out.println("Warnhinweis " + warnhinweis);
        System.out.println("Negativ " + negativ);
    }
}
