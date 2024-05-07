package classwork24.tv.model;

import classwork24.tv.model.TV;

/*
В пульте сделать методы чтобы:
1 Переключить канал вперед;
2 Переключить канал назад;
3 Переключить канал произвольно (передать номер канала).
Учтите, что каналы не должны быть отрицательными.
Переключение канала должно происходить только в том случае, если частота пульта и телевизора совпадают.
Если введенный в третьем методе канал имеет неправильный номер, не делать ничего.
 */
public class RemoteController {
    private int frequency;

    public RemoteController(int frequency) {
        this.frequency = frequency;
    }
    // getter
    public int getFrequency() {
        return frequency;
    }

    // methods for the remote controller

    public void channelForward (TV tv) {
        if (frequency == tv.getFrequency())  {
            tv.channelForward();
        }
    }
    public void channelBackward (TV tv) {
        if (frequency == tv.getFrequency()){
            tv.channelBackward();
        }
    }
    public void switchChannel (TV tv, int channelNumber)  {
        if (frequency == tv.getFrequency())  {
            tv.setCurrentChannel(channelNumber);
        }
    }
}
