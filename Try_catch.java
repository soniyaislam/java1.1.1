package Page_49;

public class Try_catch {

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
			//System.out.println("exception :" +e);
		}
		
		array [6] = 55;
		System.out.println("jamaica");
		System.out.println("MicroTech");
		
		
		
	}

}
