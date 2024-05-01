package homework.book;

import homework.book.model.Dictionary;

public class BookApplication {
    public static void main(String[] args) {
        Dictionary [] slovar = new Dictionary[3];

        slovar [0] = new Dictionary("Oxford English Dictionary", "Oxford University", 1857, 199571123,3,"British");
        slovar [1] = new Dictionary("Merriam-Webster Dictionary", "Merriam Webster", 1828, 877799306,10,"US English");
        slovar [2] = new Dictionary("Dal's Dictionary", "Vladimir Dal", 1863, 551940429,12,"Russian");

        for (int i = 0; i < slovar.length; i++) {
            slovar[i].display();
        }
    }
    }
