import java.io.*;
import java.lang.String;
public class StringDemo2{
    public static void main(String args[]){
        String s1="Welcome";
        String s2=new String("Welcome");
        String s3="Wel";
        boolean x=s1.equals(s2);
        System.out.println("s1 and s2 are equal "+x);
        boolean y=s1.equals(s3);
        System.out.println("s1 and s3 are equal "+y);
        System.out.println("The character at 4th position in s3 is "+s3.charAt(2));
         System.out.println("The character at 4th position in s1 is "+s1.charAt(3));
         System.out.println("The length of s1 is"+s1.length());
         System.out.println("s1 in uppercase is "+s1.toUpperCase());
         System.out.println("After concatenating s1 and s3 is "+s1.concat(s3));
         System.out.println("After concatenating s3 and s1 is "+s3.concat(s1));
         System.out.println("s1 contains s3 "+s1.contains(s3));
          System.out.println("s3 contains s1 "+s3.contains(s1));
    }
}
