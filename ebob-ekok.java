import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int x = 1, num1, num2, numMin;
		Scanner input = new Scanner(System.in);
		
				
		while(true) {
			
			System.out.print("EBOB-EKOK işlemi için birinci sayıyı girin: ");
			num1 = input.nextInt();
			System.out.print("EBOB-EKOK işlemi için ikinci sayıyı girin: ");
			num2 = input.nextInt();
		
			numMin = Math.min(num1, num2);
			
		        while (numMin >= 1) {
		            if ((num1 % numMin == 0) && (num2 % numMin == 0)) {
		            	break;
		            }
		            numMin--;
		        }
		        System.out.print("\nEBOB: "+numMin);
		        
		        while (x < (num1 * num2)/numMin ) {
		            x++;
		        }
		        System.out.print("\nEKOK: "+x);
		        
		        break;
    }
  }
}
