public class PracticeProblem {

	public static void main(String args[]) {

	}
//Question 1
public static int[] createIntArray() {
	int[] numbers = new int[5];
	numbers = new int[]{1, 2, 3, 4, 5};
	return numbers;
}
//Question 2
public static String[] createArray(String s1, String s2, String s3, String s4) {
	String[] strings = new String[4];
	strings = new String[]{s1, s2, s3, s4};
	return strings;
}
//Question 3
public static int findValue(int value, int[] array) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
            return i; 
        }
    }
    return -1; 
}


//Question 4
public static int findThirdValue(String s1, String[] array) {
	int count = 0;
	for (int i = 0; i < array.length; i++) {
		if (array[i].equals(s1)) {
			count++;
			if (count == 3) {
				return i;
			}
		}
	}
return -1;
}
}