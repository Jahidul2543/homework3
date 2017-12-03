package homework3;

public class IfElseStatement {
	/*
	 * Clunker Motors Inc. is recalling all vehicles from model years 2001-2006. A
	 * boolean variable named recalled has been declared. Given a variable modelYear
	 * write a statement that assigns true to recalled if the value of modelYear
	 * falls within the recall range and assigns false otherwise.
	 */

	public static void main(String[] args) {
		int modelYear = 2000;
		boolean recalled;

		if (modelYear >= 2001 && modelYear <= 2006) {
			recalled = true;
		} else {
			recalled = false;
		}
		System.out.println(recalled);
	}

	  
}
