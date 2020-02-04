import java.util.Scanner;

public class Encrypter {

	public static char encrypt(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 

		String Digistss ; 
		int in;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0; 
		
		
		Digistss = scan.nextLine();
		in = Integer.parseInt(Digistss);
	
	if(Digistss.length() == 4  ) {
		 
			
		a = in / 1000; 
		b = in / 100 % 10;
		c = in / 10 % 10;
		d = in % 10;
		
		a = (a+7)%10;
		b = (b+7)%10;
		c = (c+7)%10;
		d = (d+7)%10;
		
	System.out.print("This is the encrypted number: " + a + b + c + d );
	}
	char A = 0 , B = 0, C = 0, D = 0;
	a = A;
	b = B;
	c = C;
	d = D;

	return (char) (A+B+C+D); 

		 
	}

	
	}


