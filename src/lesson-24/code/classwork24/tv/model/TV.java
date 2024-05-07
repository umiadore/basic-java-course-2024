package classwork24.tv.model;
/*
Создать два класса - пульт и телевизор.
В обоих классах описать свойство "частота" (frequency).
В телевизоре описать свойство "текущий канал".
Описать в обоих классах конструкторы и аксесоры.
 */

public class TV {
    private int frequency;
    private int currentChannel;

    // constructor
    public TV(int frequency) {
        this.frequency = frequency;
        this.currentChannel = 1; // создаем сами
    }
    // getters
    public int getFrequency() {
        return frequency;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }
    // methods for the TV
    public void channelForward () {
        currentChannel++;
    }
    public void channelBackward () {
        if (currentChannel >1) {
            currentChannel --;
        }
    }
    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > 0) {
            this.currentChannel = currentChannel; // чтобы канал был больше нуля (не минус)
        }
    }
}
