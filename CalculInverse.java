
public class CalculInverse {
	public static double inverse(double x) {
		try {
			if(x==0.0)
				throw new ArithmeticException();
			return 1/x;
		}
		catch(ArithmeticException e){
			return 0;
		}
	}
}
