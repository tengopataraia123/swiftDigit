public class Main {
	public static void main(String[] args) throws IOException{
		
		
	}

	static int variants = 0;
	
	public static int variants(int position,int stearCount) {
		
		if(position == stearCount) {
			variants++;
		}else if(position < stearCount) {
			variants(position+1,stearCount);
			variants(position+2,stearCount);
		}else {
			return 0;
		}
		
		return variants;
	}
	
	public static int countVariants(int stearsCount) {
		
		return variants(0,stearsCount);
	}
}