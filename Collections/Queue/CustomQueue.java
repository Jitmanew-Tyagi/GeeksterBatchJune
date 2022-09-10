public class CustomQueue {
    private int[] arr = new int[10];
    private int nel;

    public int size() {
        return nel;
    }

    public void add(int ele) { // O(1)
        if(nel == arr.length) {
            System.out.println("Queue overflow...");
            return;
        }
        arr[nel ++] = ele;
    }

    public int remove() { //O(n)
        if(nel == 0)  {
            System.out.println("Queue underflow...");
            return -1;
        }

        for(int i = 0; i < nel - 1; i ++) {
            swap(i);
        }
        return arr[-- nel];
    }

    private void swap(int idx) {
        int temp = arr[idx];
        arr[idx] = arr[idx + 1];
        arr[idx + 1] = temp;
    }

    public boolean isEmpty() {
        return nel == 0;
    }

    public int peek() {
        if(nel == 0)  {
            System.out.println("Queue underflow...");
            return -1;
        }
        return arr[0];
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