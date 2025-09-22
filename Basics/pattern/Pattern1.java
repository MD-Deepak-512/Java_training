import java.util.Scanner;
public class Pattern1 {
    public static void main(String args[]){
        System.out.println("Enter the row");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 1; i<= r ; i++){
           for(int j = 0 ;j<i;j++){
            System.out.print("* ");
           }
            System.out.print("\n");
        }

    }
}
