import java.util.*;
public class Star_Pattern_twelve {

    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int space = n-1;
        int star= 1;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=space; j++){
                System.out.print(" " + " ");
            }
            for(int j=1; j<=star; j++) { 
                if(j%2==0){
                    System.out.print("!" + " ");
                } else {
                System.out.print("*" + " ");
                }
            
            }
            

            space--;
            star+=2;
            System.out.println();
        }
    }
    
}