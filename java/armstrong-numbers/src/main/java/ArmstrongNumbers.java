class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		String[] intArray = String.valueOf(numberToCheck).split("");
		int result = 0;
		for (int i = 0; i < intArray.length; i++){
			result += Math.pow(Integer.parseInt(intArray[i]), intArray.length);
		}
		return (result == numberToCheck);
	}
}
