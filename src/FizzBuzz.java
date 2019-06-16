/*  Write a program that will take an integer and print Fizz if the number is divisible by 3, Buzz if the number
 *  is divisible by 5, FizzBuzz if the number is divisible by 3 and 5, and the number itself for all other cases. */


public class FizzBuzz {
		public String fizzBuzz(int number) {
			
			if(number % 3 == 0 && number % 5 == 0){
				System.out.println("FizzBuzzz");
				
			} else if(number % 3 == 0) {
				System.out.println("Fizz");
			} else if(number % 5 == 0) {
				System.out.println("Buzz");
			} else{
				String result = Integer.toString(number);
				System.out.println(result);
			}
			return null;
			
		}
		
		
}
