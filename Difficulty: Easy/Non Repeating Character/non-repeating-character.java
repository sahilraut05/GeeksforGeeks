//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String s)
    {
        //Your code here
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
        }
        if(q.isEmpty()){
            return '$';
        }
        return q.peek();
    }
}

