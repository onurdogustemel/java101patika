
public class odev_32 {
	
	static boolean isPalindrom(int number) {
		
		int temp = number, reverseNumber = 0, lastNumber;
		
		while (temp!=0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber*10) + lastNumber;
			temp /= 10;
		}
		
		if (number==reverseNumber)
			return true;
		else
			return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrom(123124)); //Enter the number you want

	}

	
}
