package classwork;

public class Introduction {

    public static void main(String[] args) {

        // трое бандитов представляются полицией, сообщают как их зовут
        introduce();
        System.out.println("Julico Bandito");
        introduce();
        System.out.println("De La Vorro Gangsterito");
        introduce();
        System.out.println("Tuz Pik");
    } // end of psvm (main)

    // DRY - do not repeat yourself!
    public static void introduce(){
        System.out.println("Let me introduce myself");
    }

} // end of the class
