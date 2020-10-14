package swiftDigital;

public class Main {
	public static void main(String[] args) throws IOException{
		
		MyArray array = new MyArray();

		for(int i=0;i<1000;i++){
			array.add(i);
		}

		array.del(233);
		array.del(555);

		System.out.println(array);
		
	}
}