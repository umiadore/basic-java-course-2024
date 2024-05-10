package classwork25.example01;
// без последования полиформизм не сущетсвует, он возможен тут только потому что кошка и собака наследуют тот же самый метод войс из "животного"
public class Main25 {
    public static void main(String[] args) {
       Dog25 dog = new Dog25("Richie", 4);
       Cat25 cat = new Cat25("Vasya", 1); // метод привязан к объекту, а не к ссылке

       dog.voice();
       dog.pet();
       dog.feed();
       dog.cleanUp();
       dog.goForAWalk();

       cat.voice();
       cat.pet();
       cat.feed();
       cat.cleanUp();
    }
}
