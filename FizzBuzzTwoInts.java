
public class FizzBuzzTwoInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String printThis = fizzBuzz(9, 4);
System.out.print(printThis);
	}
	public static String fizzBuzz(int compareInt, int compareToInt){
		String retStr = "Fizz and Buzz";
		int int1 = compareInt;
		int int2 = compareToInt;
		if (int1 < int2){
			retStr = "Fizz";
		}else if (int1 > int2){
			retStr = "Buzz";
		}else{
			return retStr;
		}
		return retStr;
	}

}
