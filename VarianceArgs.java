class VarianceArgs{
	public static void main(String[]args){
		double sum = 0.0;
	        double[] numbers = new double[args.length];
		for(int i = 0; i < args.length; i++){
			numbers[i] = Double.parseDouble(args[i]);
			sum += numbers[i]; 
		} 
		double average = sum / args.length;
		double varianceSum = 0.0;
		for(int i = 0; i < args.length; i++){
			varianceSum += (numbers[i] - average) * (numbers[i] - average);
		}
		double variance = varianceSum / args.length;
		System.out.print("Variance:" + variance);
	}
}
