
public class Bits
{
	public static void main(String[] args) {
        int n = 14;
	    // System.out.println(decimalToBinary(n));        
	    System.out.println(Integer.toBinaryString(n));
	    // System.out.println(isBitOn(n, 0));
	    // System.out.println(isBitOn(n, 2));
	    // System.out.println(setTheBit(n, 0));
	    // System.out.println(Integer.toBinaryString(setTheBit(n, 0)));
	    System.out.println(unsetTheBit(n, 2));
	    System.out.println(Integer.toBinaryString(unsetTheBit(n, 2)));

	}

    public static boolean isBitOn(int num, int bp) { //bit position
        return (num & (1 << bp)) == 0 ? false : true;
    }

    public static int setTheBit(int n, int bp) {
        return n | (1 << bp);
    }

    public static int unsetTheBit(int n, int bp) {
        return n & (~(1 << bp));
    }

    public static String decimalToBinaryForPositives(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    public static String decimalToBinary(int n) {
        if(n > 0) return decimalToBinaryForPositives(n);
        else if (n == 0) return "0";
        else {
            int pos = -n;
            String conv = decimalToBinaryForPositives(pos);
            return twosCompliment(conv);
        }
    }

    public static String twosCompliment(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) 
            sb.append(c == '0' ? 1 : 0);
        String ans = binaryAddition(sb.toString(), "1"); 
        return "1" + ans;
        
    }

    public static String binaryAddition(String n1, String n2) {
        int i = n1.length() - 1, j = n2.length() - 1;
        int dig = 0, carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0) {
            int x = 0, y = 0;
            if(i >= 0) x = n1.charAt(i) - '0';
            if(j >= 0) y = n2.charAt(j) - '0';
            int sum = x + y + carry;
            dig = sum % 2;
            carry = sum / 2;
            sb.insert(0, dig);
            i --; j--;
        }
        if(carry > 0) sb.append(carry);
        return sb.toString();
    }




    
}