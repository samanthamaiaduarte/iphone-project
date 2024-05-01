package Model;

public class Iphone implements MusicPlayer, PhoneDevice, InternetBrowser {

    @Override
    public void showPage() {
        System.out.println("Show a web page.");
    }

    @Override
    public void openNewTab() {
        System.out.println("Opening a new tab.");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing a web page.");
    }

    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void pickUp() {
        System.out.println("Pick-up a call");
    }

    @Override
    public void voiceMail() {
        System.out.println("Calling voice mail");
    }

    @Override
    public void play() {
        System.out.println("Play a song");
    }

    @Override
    public void pause() {
        System.out.println("Pausing a song");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting a song");
    }

}
