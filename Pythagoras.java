class Pythagoras{
	public static void main(String []args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double roota = Math.sqrt((a*a) + (b*b));
		System.out.println(roota);
	}
}