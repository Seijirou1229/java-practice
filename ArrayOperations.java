package practice.utils;


public class ArrayOperations{
	public static double calculateAverage(String[]args){
		double sum = 0.0;
	        double[] numbers = new double[args.length];
		for(int i = 0; i < args.length; i++){
			numbers[i] = Double.parseDouble(args[i]);
			sum += numbers[i]; 
		} 
		double average = sum / args.length;
		return average;
	}
}