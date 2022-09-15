public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");
        // printInc(5);
        // func(2, 5, 1);
        System.out.println(pow(2, 5));
        System.out.println("Command returned");
    }

    public static void printDec(int n) {
        if(n == 0) return;
        System.out.println(n);
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if(n == 0) return;
        printInc(n - 1);
        System.out.println(n);
    }

    public static void printIncDec(int n) {
        if(n == 0) return;
        System.out.println(n);
        printIncDec(n - 1);
        System.out.println(n);
    }

    public static int pow(int x, int n) {
        if(n == 1) return x;
        int faith = pow(x, n - 1);
        int exp = faith * x;
        return exp;
    }

    public static void func(int x, int n, int ans){
        if(n == 0)  {
            System.out.println(ans);
            return;
        }
        func(x, n-1, ans * x); //call
    }

    public static void Get_value_without_return(int value, int pow, int ans){
      if(pow == 0){
        System.out.println(ans);
        return;
      }
        ans= value*ans;
        Get_value_without_return(value, pow-1, ans);
    }

}

