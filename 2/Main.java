public class Main {
	public static void main(String[] args) throws IOException{
		
		
	}

	public static int minSplit(int amount) {
		int fifty = amount/50;
		amount %= 50;
		int twenty = amount/20;
		amount %= 20;
		int ten = amount / 10;
		amount %= 10;
		int five = amount/5;
		amount %= 5;
		int one = amount;
		return fifty+twenty+ten+five+one;
	}
}