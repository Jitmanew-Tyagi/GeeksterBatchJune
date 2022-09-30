import java.io.*;
import java.util.*;

public class ShellRotate {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < m; j ++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();
        rotateTwoD(arr, s, r);
        display(arr);
    }
    
    public static void rotateTwoD(int[][] arr, int s, int r) {
        int[] oneD = getOneD(arr, s);
        rotateOneD(oneD, r, oneD.length);
        fillBack(oneD, arr, s);
        
    }
    
    public static int[] getOneD(int[][] arr, int s) {
        int top = s - 1, left = s - 1, bottom = arr.length - s, right = arr[0].length - s;
        
        int size = 2 * ((right - left) + (bottom - top)), oneD[] = new int[size], idx = 0;
        for(int i = left; i <= right; i ++) oneD[idx ++] = arr[top][i];
        top ++;
        for(int i = top; i <= bottom; i ++) oneD[idx ++] = arr[i][right];
        right --;
        for(int i = right; i >= left; i --) oneD[idx ++] = arr[bottom][i];
        bottom --;
        for(int i = bottom; i >= top; i --) oneD[idx ++] = arr[i][left];
        left ++;
        return oneD;
    }
    
    public static void fillBack(int[] oneD, int[][] arr, int s) {
        int top = s - 1, left = s - 1, bottom = arr.length - s, 
        right = arr[0].length - s, idx = 0;
        
        for(int i = left; i <= right; i ++) arr[top][i] = oneD[idx ++];
        top ++;
        for(int i = top; i <= bottom; i ++) arr[i][right] = oneD[idx ++];
        right --;
        for(int i = right; i >= left; i --) arr[bottom][i] = oneD[idx ++];
        bottom --;
        for(int i = bottom; i >= top; i --) arr[i][left] = oneD[idx ++];
        left ++;
    }
    
    public static void rotateOneD(int[] arr, int k, int n) {
        k %= n;
        k = k < 0 ? k + n : k;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
    
    public static void reverse(int[] arr, int s, int e) {
        while(s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s ++;
            e --;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

// https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/ring-rotate-official/ojquestion