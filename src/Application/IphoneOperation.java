package Application;

import Model.Iphone;

public class IphoneOperation {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Phone Device
        iphone.call();
        iphone.pickUp();
        iphone.voiceMail();

        //Music Player
        iphone.play();
        iphone.pause();
        iphone.selectMusic();

        //Internet Browser
        iphone.openNewTab();
        iphone.showPage();
        iphone.refresh();
    }
}
