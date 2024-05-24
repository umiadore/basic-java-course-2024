package classwork31.example02;

/*
https://www.google.com/search?q=java
https://www.w3schools.com/java/
https://www.w3schools.com/java/java_oop.asp
 */
public class Main01 {
    public static void main(String[] args) {

        TabHistory tapHistory = new TabHistory("https://www.google.com/");
        tapHistory.goToPage("https://www.google.com/search?q=java");
        tapHistory.goToPage("https://www.w3schools.com/java/");
        tapHistory.goToPage("https://www.w3schools.com/java/java_oop.asp");
        System.out.println(tapHistory.getCurrentPage());
        tapHistory.goBack();
        tapHistory.goBack();
        System.out.println(tapHistory.getCurrentPage());
        tapHistory.goToPage ("https://www.oracle.com/java/technologies/downloads/");
        System.out.println(tapHistory.getCurrentPage());
        tapHistory.goBack();
        System.out.println(tapHistory.getCurrentPage());
        tapHistory.goForward();
        System.out.println(tapHistory.getCurrentPage());
}
}
