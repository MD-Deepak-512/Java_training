import java.util.*;
public class Pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and col");
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i = 0 ; i<r ; i++){
            for(int j=c;j>i;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
