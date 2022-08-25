class OTV {
    int x = 5;
}

class TV extends OTV{
    int x = 10;
    public void ON() {
        System.out.println("Switching on: 10 sec");
    }
    public void OFF() {
        System.out.println("Switching OFF: 20 sec");
    }
    public void changeChannel() {
        System.out.println("Changin channel: 2 sec");
    }
}

class STV extends TV {
    int x = 20;
    @Override
    public void ON() {

        System.out.println(super.super.x);
        System.out.println("Switching on: 1 sec");
    }

    @Override
    public void OFF() {
        System.out.println("Switching OFF: 2 sec");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changin channel: 10 ms");
    }

    public void netflix() {
        System.out.println("Netflix dhudhum");
    }

    public void youtube() {
        System.out.println("Youtube");
    }
}

public class TVDemo {
    public static void main(String[] args) {
        TV mi = new STV();
        mi.ON();
        mi.OFF();
        mi.changeChannel();
        mi.youtube();
    }
}