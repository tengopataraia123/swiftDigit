public class Main {
	public static void main(String[] args) throws IOException{
		
		
	}

	public static int notContains(int[] array) {
		Arrays.sort(array);
		int ans = 1;
		for(int i=0;i<array.length;i++) {
			if(array[i] == ans)
				ans++;
			else
				break;
		}
		return ans;
	}
}