import java.io.*;
import java.lang.String;
public class StringComparisionDemo{
    public static void main(String args[]){
        String s1="SASI";
        String s2="SITE";
        String s3="SASI";
        String s4="SITE";
        String s5="Sasi";
        String s6="SASI SITE";
        System.out.println("s1 equals s2 returns:"+s1.equals(s2));
        System.out.println("s3 equals s5 returns:"+s3.equals(s5));
        System.out.println("s3 equals s5 returns:"+s3.equalsIgnoreCase(s5));
        System.out.println("s1 CompareTo s2 returns:"+s1.compareTo(s2));
        System.out.println("s3 CompareTo s5 returns:"+s3.compareTo(s5));
        System.out.println("s5 CompareTo s6 returns:"+s5.compareTo(s6));
        System.out.println("s1==s2 returns:"+s1==s2);
        System.out.println("s3==s5 returns:"+s3==s5);
    }
}
