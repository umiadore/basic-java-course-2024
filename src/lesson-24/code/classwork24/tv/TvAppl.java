package classwork24.tv;

import classwork24.tv.model.RemoteController;
import classwork24.tv.model.TV;

public class TvAppl {
    public static void main(String[] args) {
        TV tv = new TV(10);
        RemoteController remoteController = new RemoteController(10);

        remoteController.channelForward(tv);
        System.out.println("Current Channel:" + tv.getCurrentChannel());

        remoteController.switchChannel(tv,11);
        System.out.println("Current Channel: " + tv.getCurrentChannel());

        remoteController.channelBackward(tv);
        System.out.println("Current Channel: " + tv.getCurrentChannel());
    }
}
