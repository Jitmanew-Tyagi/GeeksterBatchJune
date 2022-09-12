// https://practice.geeksforgeeks.org/problems/min-sum-formed-by-digits3551/1?
// Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. All digits of the given array must be used to form the two numbers.

// Any combination of digits may be used to form the two numbers to be summed.  Leading zeroes are permitted.

// If forming two numbers is impossible (i.e. when n==0) then the "sum" is the value of the only number that can be formed.
// //{ Driver Code Starts
// //Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public static long minSum(int arr[], int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr) pq.add(i);
        long a = 0, b = 0;
        boolean flag = false;
        while(pq.size() > 0) {
            if(!flag) {
                a = a * 10 + pq.remove();
            } else {
                b = b * 10 + pq.remove();
            }
            flag = flag ? false : true;
            // flag = ~flag;
        }
        return a + b;
    }
}
