class FizzBuzz{
	public static void main(String[]args){
		for (int num = 1; num < 101; ++num){
			if (num % 15 == 0){
			System.out.print(",FizzBuzz");
			}else if (num % 3 == 0){
			System.out.print(",Fizz");
			}else if (num % 5== 0){
			System.out.print(",Buzz");
			}else if (num == 1){
			System.out.print(1);
			}else{
			System.out.print("," + num);
			}
		}
	}
}