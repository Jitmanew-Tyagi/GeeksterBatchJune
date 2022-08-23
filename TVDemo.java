class TV {
    public void ON() {
        System.out.println("TV Switched ON");
    }
    public void OFF() {
        System.out.println("TV Switched OFF");
    }
    public void changeChannel() {
        System.out.println("Channel Changed");
    }
}


class SmartTV extends TV{

    public void ON() {
        System.out.println("TV Switched ON in 1 sec");
    }
    
    public void youTube() {
        System.out.println("Here's Youtube");
    }
}

public class TVDemo {
    public static void main(String[] args) {
        TV videocon = new TV();
        videocon.ON(); 
        videocon.changeChannel(); 

        SmartTV mi = new SmartTV();
        mi.ON();
        mi.changeChannel();
        mi.youTube();
    }
}