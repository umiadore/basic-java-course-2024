package homework;

public class Fairytale {
    // сказка о репке.
    public static void main(String[] args) {
        System.out.println("And the fairytale begins...");
        // Call the first method to start telling the fairytale
        Turnip(); // repka
    }

    public static void Turnip() {
        System.out.println("A Grandfather planted one Turnip, it did grow unexpectedly big. He tried to pull it out," +
                "but it did not work.");
        GrandfatherCouldNotPullItOut();
    }

    public static void GrandfatherCouldNotPullItOut() {
        System.out.println("And the Grandmama tried to help");
        ButSheFailedAsWell();
    }

    public static void ButSheFailedAsWell() {
        System.out.println("And granddaughter tried to pull it out");
        ButItDidNitWorkOut();
    }

    public static void ButItDidNitWorkOut() {
        System.out.println("Then the grandson tried as well");
        TheyNeededMoreHelp();
    }

    public static void TheyNeededMoreHelp() {
        System.out.println("Then the Cat & Mouse did also join and they pulled all together..");
        AlltogetherTheyPulledtheTurnipOut();
    }

    public static void AlltogetherTheyPulledtheTurnipOut() {
        System.out.println("All together They Pulled the Turnip Out");
    }
}
