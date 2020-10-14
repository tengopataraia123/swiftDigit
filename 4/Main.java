public class Main {
	public static void main(String[] args) throws IOException{
		
		
	}

	public static boolean isProperly(String sequence) {
		int countLeft = 0;
		int countRight = 0;
		
		for(char c : sequence.toCharArray()) {
			switch(c) {
			case '(':
				countLeft++;
				break;
			case ')':
				countRight++;
				break;
			}
		}
		
		return countLeft == countRight;
	}
}