import java.util.*;
public class Star_Pattern_eighteen {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int star = 1;
		int space =n/2;
		
		for(int i=1; i<=n;  i++){
		    
		    for(int j=1; j<=space; j++){
		        System.out.print(" " + " ");
		    }
		    for(int j=1; j<=star; j++){
		        System.out.print("*" + " ");
		    }
		    
		    if(i<=n/2){
		        space--;
		        star+=2;
		    } else {
		        space++;
		        star-=2;
		    }
		    
		    System.out.println();
		}
	}
}
