import java.util.*;
public class Star_Pattern_nineteen {

    public static void main(String args [] ){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = n/2+1;
        int space = -1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=star; j++) {

                if (j!= (n/2+1) ) {
                System.out.print("*" + " ");
                }
                
            }
            for(int j=1; j<=space; j++){
                System.out.print(" " + " ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*" + " ");
            }

            if(i<=n/2){
                star--;
                space+=2;
            } else {
                star++;
                space-=2;
            }
            System.out.println();

        }
    }
}