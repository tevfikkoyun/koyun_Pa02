import java.util.Scanner;

public class BMICalculator {

	Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		
		double Weight;
		double Height;
		int choice;
		double bmi;
		String BmiCategory;
		
		public void readUserData() {
			readUnitType();
			readMeasurementData ();
		}
		
		
		private void readUnitType() {
			System.out.println("Choose a calculator \n1 for Imperial calculator or 2 for Metric calculator :");
			
			choice = scan.nextInt();
				if(choice != 1 && choice != 2) {
					System.out.println("You must Choose 1 or 2! try again");
					System.exit(0);
					
				}
			}
		
		private void readMeasurementData () {
			if(choice==1) { 
				readImperialData();			
			}
			else {
				readMetricData();
			}
		}

		private void readImperialData() {
			System.out.print("Enter Your Height in Inches: ");
			setHeight(scan.nextDouble());
			System.out.print("Enter Your Weight in Pounds: ");
			setWeight(scan.nextDouble());
			
		}
		
	
		private void readMetricData() {
			System.out.print("Enter Your Height in centimeters: ");
			setHeight(scan.nextDouble());
			System.out.print("Enter Your Weight in Kilograms: ");
			setWeight(scan.nextDouble());
			
			
		}
		
		public double getWeight() {
			return Weight;
		}
		
		public double getHeight() {
			return Height;
		}
		
		public double getBmi() {
			return bmi;
		}
		
		public void calculateBmi() {

			if (choice==1) {
				bmi = (703 * getWeight())/(getHeight() * getHeight());
			}
			else  {
				bmi = (getWeight()) / (getHeight() * getHeight());
			}

			calculateBmiCategory();
		}
		
		private void calculateBmiCategory() {
			 if (bmi < 18.5) {
				 	BmiCategory = "You are underweight" ;
		        } else if (bmi < 25) {
		        	BmiCategory = "You are normal";
		        } else if (bmi < 30) {
		        	BmiCategory = "You are overweight";
		        } else {
		        	BmiCategory = "You are obese" ;
			}
		} 
		
	
		public String getBmiCategory() {
			return BmiCategory;
		}
		
		
		private void setHeight(double Height) {
			if(Height > 0) {
				this.Height = Height;
			} else {
				System.out.println("You Can Not Be 0 or negative Height! ");
				System.exit(0);
			}
			
		}
		
		private void setWeight(double Weight) {
			if(Weight > 0) {
				this.Weight = Weight;
			} else {
				System.out.println("You Can Not Be 0 or negative Weight ! ");
				System.exit(0);
			}
		}
		
		
		
		public void displayBmi() {
			System.out.printf("Your BMI score is: %.1f\n And %s", getBmi(), getBmiCategory());
		}
	
public static void main(String[] args) {
    BMICalculator app = new BMICalculator();
    app.readUserData();
    app.calculateBmi();
    app.displayBmi();
}
	
}