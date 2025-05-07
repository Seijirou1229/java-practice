class RangeSummation{
	public static void main(String[]args){
		int b = Integer.parseInt(args[1]);
		int sum = 0;
		for (int a = Integer.parseInt(args[0]); a <= b; a++){
		System.out.print(a);
		sum += a;
			if (a < b){
			System.out.print("+");	
			}else{
			System.out.print("=" + sum);
			}
		}
	}
}