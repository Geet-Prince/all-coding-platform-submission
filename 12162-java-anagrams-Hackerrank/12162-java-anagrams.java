import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        a=a.toLowerCase();
        b=b.toLowerCase();
        char a1[]=a.toCharArray();
        char b1[]=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        if(Arrays.equals(a1,b1)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
        
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna