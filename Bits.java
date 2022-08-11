
public class Bits
{
	public static void main(String[] args) {
        int n = -7;
	    System.out.println(decimalToBinary(n));        
	    System.out.println(Integer.toBinaryString(n));        
	}

    public static String decimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }


    
}