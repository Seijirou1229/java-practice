class ClacBmi{
	public static void main(String[]args){
		double heights = Double.parseDouble(args[0]);
		double weight = Double.parseDouble(args[1]);
		double bmi = weight / (heights * heights);
		if (bmi < 18.5){
		System.out.println("Your health is: too slim　（BMI=" + bmi + ")" );
		}else if (18.5 < bmi && bmi < 25){
		System.out.println("Your health is: standard　（BMI=" + bmi + ")");
		}else if (25 < bmi && bmi < 30){
		System.out.println("Your health is: a bit fat　（BMI=" + bmi + ")");
		}else{
		System.out.println("Your health is: too fat 　（BMI=" + bmi + ")");
		}
	}
}