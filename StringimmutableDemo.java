import java.io.*;
import java.lang.String;
public class StringimmutableDemo{
    public static void main(String args[]){
        String s1="SASI";
        s1.concat("SITE");
        System.out.println("After concatenating s1 and s2 is "+s1);
        String s="Mohan";
        s=s.concat("Sure");
        System.out.println("After concatenating "+s);
    }
}
