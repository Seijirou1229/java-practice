class VarianceArgs{
	public static void main(String[]args){
		double sum = 0.0;
		for(int i = 0; i < args.length; i++){
		double num = Double.parseDouble(args[i]);
		sum += num; 
		} 
		double average = sum / args.length;
		double varianceSum = 0;
		for(int k = 0; k < args.length; k++){
		double num2 = Double.parseDouble(args[k]);
		varianceSum += (num2 - average) * (num2 - average);
		}
		double variance = varianceSum / args.length;
		System.out.print("Variance:" + variance);
	}
}