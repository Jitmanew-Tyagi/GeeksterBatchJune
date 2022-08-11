import java.lang.Math;
public class Maths
{
	public static void main(String[] args) {
	    // System.out.println(minVal(2, 5));
	    // System.out.println(Math.min(2, 5));
	    // System.out.println(minVal(new int[] {1, 2, 0, -1, 5, 1, 2}));
        // System.out.println(floor(-5.1f));
        // System.out.println(power(2, 5));
        System.out.println(isPrime(32));
        
	}
	
	public static int minVal(int a, int b) {
	    return a < b ? a : b;
	}
	
	public static int minVal(int[] arr) {
	    int min = arr[0];
	    for(int i : arr) {
	        if(i < min) min = i;
	    }
	    return min;
	}

    public static int power(int x, int n) {
        int ans = 1;
        while(n > 0) {
            if(n % 2 == 1) {
                ans = ans * x;
                n --;
            } else {
                x *= x;//x -> x^2
                n /= 2; //n = n / 2
            }
        }
        return ans;
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i * i <= n; i ++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    // (a + b) % k = (a % k + b % k) % k
    // (a - b) % k = (a % k - b % k) % k
    // (a * b) % k = (a % k * b % k) % k

    public static void printPrimeFactors(int n) {
        int i = 2;
        while(n > 1) {
            while(n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
            i ++;
        }
    }
	
}
