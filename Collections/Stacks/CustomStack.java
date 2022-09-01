public class CustomStack {
    int MAX_CAP = 10;
    private int[] arr = new int[MAX_CAP];
    
    int nel = 0;

    public int size() {
        return nel;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int pop() {
        if(this.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[-- nel];
    }

    public void push(int data) {
        if(this.size() == MAX_CAP) {
            System.out.println("Stack Underflow");
            return;
        }
        arr[nel ++] = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < nel; i ++) sb.append(arr[i] + ", ");
        if(sb.length() > 1) sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }
}