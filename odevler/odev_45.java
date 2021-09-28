
public class odev_45 {
	
	static boolean isPalindrome(String str) {
		
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	static boolean isPalindrome2(String str) {
		
		String reverse = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		/*if (str.equals(reverse)) {
			return true;
		}else
			return false;
			*/
		
		return str.equals(reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome2("abba"));

	}

}
