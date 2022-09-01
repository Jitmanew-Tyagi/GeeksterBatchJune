public class Client {
    public static void main(String[] args) {
       CustomArrayList arl = new CustomArrayList();
        for(int i = 0; i < 20; i ++) {
            arl.add(i + 1);
        }  
        // for(int i = 0; i < arl.size(); i ++) System.out.print(arl.get(i) + " ");
        System.out.println(arl);
        arl.remove(8);
        arl.set(0, 10);
        System.out.println();
        System.out.println(arl);
        // for(int i = 0; i < arl.size(); i ++) System.out.print(arl.get(i) + " ");
        System.out.println();
    }
}