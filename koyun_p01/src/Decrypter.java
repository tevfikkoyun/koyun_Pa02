import java.util.Scanner;

public class Decrypter {

	public static char Decrypt() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String Digits  ; 
		int n;
		int aa = 0;
		int bb = 0;
		int cc = 0;
		int dd = 0; 
		
				
		Digits = scan.nextLine();
		n = Integer.parseInt(Digits);
	
	if(Digits.length() == 4  ) {
		 
			
		 aa = n / 1000; 
		 bb = n / 100 % 10;
		 cc = n / 10 % 10;
		 dd = n % 10;
		
		aa = ((aa - 7) + 10) % 10;
		bb = ((bb - 7) + 10) % 10;
		cc = ((cc - 7) + 10) % 10;
		dd = ((dd - 7) + 10) % 10;
	System.out.print("This is the encrypted number: " + cc + dd + bb + bb );
	}
	char A = 0 , B = 0, C = 0, D = 0;
	 aa = A;
	 bb = B;
	 cc = C;
	 dd = D;

	 return (char) (A+B+C+D); 
	

	}

	

}
