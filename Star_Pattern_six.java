import java.util.*;
public class Star_Pattern_six{

public static void main(String args []){

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int star =n;
        int space= 0;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=space; j++){
                System.out.print(" "+ " ");
            } 
            for(int j=1; j<=star; j++){
                System.out.print("*" + " ");
            }
             
            
            
            star--;;
            space+=2;
            System.out.println();
        }

    }

    
}