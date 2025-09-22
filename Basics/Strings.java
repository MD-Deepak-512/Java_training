import java.util.*;
import java.io.*;

public class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("The entered string is " + str + "\n The lenght of the string is: "+ str.length());
        System.out.println("The convertion of string to upper case: "+str.toUpperCase());
        
    }
}