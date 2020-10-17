public class Main {
	public static void main(String[] args) throws IOException{
		
		
	}

	public static boolean isPalindrome(String text) {
		for(int x=0,y=text.length()-1;x<=y;x++,y--) {
			if(text.charAt(x) != text.charAt(y)) {
				return false;
			}
		}
		return true;
	}
}
