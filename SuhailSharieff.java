import java.util.*;
import java.lang.*;
import java.io.*;

public class SuhailSharieff {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
        for (int v = 0; v < t; v++) {
            System.out.println("Enter string 1 withoout spaces: ");
           String s1=sc.next();
           System.out.println("Enter string 2 withoout spaces: ");
           String s2=sc.next();
           int mind=0,maxd=0;
           //min diff=except question mark haw many dissimilar
           for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!='?'&&s2.charAt(i)!='?'&&s1.charAt(i)!=s2.charAt(i)){
                mind++;
            } else if((s1.charAt(i)=='?'||s2.charAt(i)=='?')){
                maxd++;
            }
           }
           System.out.println("Min diff that could exist is : "+(mind)+" and max diff that could exist is:  "+(mind+maxd));
          
        }

    }
}
