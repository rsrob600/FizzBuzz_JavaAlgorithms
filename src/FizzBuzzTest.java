
public class FizzBuzzTest {
	public static void main(String[] args) {
		
		FizzBuzz iD = new FizzBuzz();
		String fizzBuzz = iD.fizzBuzz(3);
		System.out.println(fizzBuzz);  // Divisible by 3 = Fizz
				
		fizzBuzz = iD.fizzBuzz(-3);
		System.out.println(fizzBuzz); // Divisible by 3 = Fizz
		
		fizzBuzz = iD.fizzBuzz(6);
		System.out.println(fizzBuzz);  // Divisible by 3 = Fizz
		
		fizzBuzz = iD.fizzBuzz(5);
		System.out.println(fizzBuzz); // Divisible by 5 = Buzz
		
		fizzBuzz = iD.fizzBuzz(10);
		System.out.println(fizzBuzz);  // Divisible by 5 = Buzz
		
		fizzBuzz = iD.fizzBuzz(15);
		System.out.println(fizzBuzz); // Divisible by 3 & 5 = FizzBuzz
		
		fizzBuzz = iD.fizzBuzz(30);
		System.out.println(fizzBuzz);  // Divisible by 3 & 5 = FizzBuzz
		
		fizzBuzz = iD.fizzBuzz(2);
		System.out.println(fizzBuzz);  // everything else NOT divisible by 3 OR 5 = 2
		
		fizzBuzz = iD.fizzBuzz(-2);
		System.out.println(fizzBuzz);  // everything else NOT divisible by 3 OR 5 = -2
		
		fizzBuzz = iD.fizzBuzz(8);
		System.out.println(fizzBuzz);  // everything else NOT divisible by 3 OR 5 = 8
		
	}

}
