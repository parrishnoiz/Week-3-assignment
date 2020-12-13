package week3Assignment;

public class Assignment {

	public static void main(String[] args) {
		
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 14};
		
		int firstNum = ages[0];
		int lastNum = ages[ages.length-1];
		
		int difference = firstNum - lastNum;
				
		System.out.println(difference);
		
		System.out.println(calculateAverage(ages));
		
		
		
		
		String[] names = new String[6];
		
		names [0] = "Sam";
		names [1] = "Tommy";
		names [2] = "Tim";
		names [3] = "Sally";
		names [4] = "Buck";
		names [5] = "Bob";
		
		int sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		
		int average = sum / names.length;
		System.out.println("The average number of letters per name = " + average);
		
		
		String allNames = "";
		for (int x = 0; x < names.length; x++) {
			allNames += names[x] + " ";
		}
		System.out.println(allNames);

			
		
		
		int [] nameLengths = new int[names.length];
		for (int y = 0; y < names.length; y++) {
			nameLengths[y] = names[y].length(); 
		}
		
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("The length of all names = " + sum);
		
		System.out.println(multiplyString("Hello", 3));
		
		System.out.println(getFullName("Parrish", "McKinney"));
		
		System.out.println(checkIfSumGreaterThan100(ages));
		
		double [] grades = {84.7, 92.9, 76.3, 87.7, 66.6, 99.9};
		System.out.println(calculateAverage(grades));
		
		double [] grades2 = {78.4, 98.9, 67.9, 33.3, 88.1, 98.3};
		System.out.println(calculateAverage(grades2));
		
		
		String firstName = "Parrish";
		String lastName = "McKinney";
		String fullName = greetNewUser(firstName, lastName);
		
		System.out.println(fullName);
		
		
		
			
		}
			
			
	
	public static int calculateAverage(int[] ages) {
		int average = 0;
		for (int number : ages) {
		average += number;
		}
		return average / ages.length;
		}

	
	public static String multiplyString (String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++){
			result += str;
		}
		return result;
	}
	
	
	private static String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	
	
	private static boolean checkIfSumGreaterThan100(int[] ages) {
	int total = 0;
	for (int number : ages) {
		total += number;
	}
	return total > 100;
	  }
	
	
	
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
		sum += number;
		}
		return sum / numbers.length;
	}	
	
	
	//public static boolean whichClassHasHigherAverage(double [] grades) {
		//double sum = 0;
		//for (double number : grades) {
		//sum += number;
		//}
		//return grades > grades2;
		
		//--------figure this one out later
		
		

	//}
	
	//---------------------------------------------------------------------------------
	//public static boolean willBuyDrink; {
		//boolean isHotOutside = true;{
		//double moneyInPocket = 45.50;
		//}
	

		//return isHotOutside = true && moneyInPocket >= 10.50;			
	//}
	

	
	
	
	//Greeting a new user with this method.
	
	public static String greetNewUser(String x, String y) {
		String fullName = x + " " + y;
		return "Hello, " + fullName;
	}











}

	
	
	
	
	
	
	
	
	
	
	
	

