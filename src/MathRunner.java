
public class MathRunner {
	public static void main( String args[] ){
		int x = IO.getInt();
		int y = IO.getInt();

		//Make sure to check both fields
		System.out.println("PI = " + Math.PI);

		//Make sure to check all three cases of possible outcomes
		System.out.println("Max: " + Math.max(x,y) );
		System.out.println("Min: " + Math.min(x,y) );
		System.out.println("Absolute Value = " + Math.abs(x) );
	}
}
