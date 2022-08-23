interface ICamera {
    void capture();
    void record();
}

interface IBrowser {
    void loadWebpage();
    void download();
}

class Smartphone implements ICamera, IBrowser{
    public void switchOn() {
        System.out.println("ON");
    }
    public void func() {
        System.out.println("func");
    }

    public void capture() {
        System.out.println("capture");
    }
    public void record() {
        System.out.println("record");
    }
    public void loadWebpage() {
        System.out.println("loadWebpage");
    }
    // public void download() {
    //     System.out.println("download");
    // }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone();
        iphone.func();
        Smartphone.download();
        Smartphone.record();
    }
}