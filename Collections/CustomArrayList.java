public class CustomArrayList {
    int cap = 10, nel = 0;
    private int[] arr = new int[cap];

    public int size() {
        return nel;
    }

    public void add(int data) {
        if(nel == arr.length) grow();
        arr[nel ++] = data;
    }

    private void grow () {
        System.out.println("GROWWWING");
        cap *= 2;
        int[] temp = new int[cap];
        int idx = 0;
        for(int i : arr) temp[idx ++] = i;
        arr = temp;
    }


    private boolean check(int idx) {
        if(idx < 0 || idx >= this.size()) {
            System.out.println("Invalid index");
            return false;
        }
        return true;
    } 

    public int get(int idx) {
        if(!check(idx))             
            return -1;
        return arr[idx];
    }

    public int remove(int idx) {
        if(!check(idx)) return -1;
        int retValue = arr[idx];
        for(int i = idx; i < nel - 1; i ++) {
            swap(i);
        }
        nel --;
        return retValue;
    }

    private void swap(int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    public void set(int idx, int data) {
        if(!check(idx)) return;
        arr[idx] = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < nel; i ++) sb.append(i + ", ");
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

}