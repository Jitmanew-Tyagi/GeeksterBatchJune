class Alto {
    static int noob = 0;
    private Alto() {

    }

    static Alto onlyObject = null;

    public static Alto getInstance() {
        if(noob < 10) 
        {
            onlyObject = new Alto();
            noob ++;
            return onlyObject;
        } else {
            System.out.println("limit exhausted");
            return null;
        }
    }

    public String sayMyName() {
        return "Alto";
    }
}
public class Main {
    public static void main(String[] args) {
        Alto alto = Alto.getInstance();
        System.out.println(Alto.getInstance());
        System.out.println(Alto.getInstance());
        System.out.println(Alto.getInstance());
        System.out.println(Alto.getInstance());
        System.out.println(Alto.getInstance());
        System.out.println(Alto.getInstance());
        System.out.println(Alto.getInstance());
        System.out.println(Alto.getInstance());
        System.out.println(Alto.getInstance());
        System.out.println(Alto.getInstance());
        System.out.println(Alto.getInstance());
        System.out.println(alto.sayMyName());
    }
}