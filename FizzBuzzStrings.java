
public class FizzBuzzStrings {

	FizzBuzzStrings newTest = new FizzBuzzStrings();
	String printThis = newTest.fizzBuzz("Rock Is Dead", "Long Live Rock");

	public static String fizzBuzz(String compStr, String compToStr) {
		String retStr = "Fizz the Buzz!";
		String str1 = compStr;
		String str2 = compToStr;
		if (str1.equalsIgnoreCase(str2)) {
			return retStr;
		} else if (str1.compareToIgnoreCase(str2) < 0) {
			retStr = "fizz";
		} else {
			retStr = "Buzz";
		}
		return retStr;
	}
}
