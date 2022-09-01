public class Client {
    public static void main(String[] args) {
       CustomStack st = new CustomStack();
       for(int i = 0; i < 8; i ++) {
            st.push(i);
       }
       System.out.println(st);
       while(!st.isEmpty()) {
        System.out.println(st.pop());
       }
       System.out.println(st.toString());
    }
}