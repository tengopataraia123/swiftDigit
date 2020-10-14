package swiftDigital;

public class MyArray {

	public int[] list;
	
	public MyArray() {
		list = new int[1];
	}
	
	public void add(int num) {
		if(num > list.length-1) {
			int[] newList = new int[num+1];
			System.arraycopy(list, 0, newList, 0, list.length);
			newList[num] = num;
			list = newList;
		}else {
			list[num] = num;
		}
	}
	
	public void del(int index) {
		list[index] = 0;
	}
	
	public void print() {
		System.out.print("[");
		for(var elem : list) {
			System.out.print(elem+", ");
		}
		System.out.print("]");
	}
	
}
