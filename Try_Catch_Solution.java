 package Page_49;

public class Try_Catch_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =10;
		int b = 0;
		int result;
		int [] array =new int [6];
		try{
			result = a/b;
			System.out.println(result);
			
		}
		catch (ArithmeticException e) {
			System.out.println("Divided by Zero error");
			
		}
		try {
		array [15] = 55;
		System.out.println(array [15]);
		}
		catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("array out of bound Error");
		}
		System.out.println("jamaica");
		System.out.println("MicroTech");
		
		 
		
	

}

	}


