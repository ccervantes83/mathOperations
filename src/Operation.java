
public class Operation {

	private int total=0; 
	
	public void add(int a, int b) {
		total=a+b;
	}

	public int total() {
		return total;
	}

	public void substract(int i, int j) {
		total=i-j;
	}

	public void multiplicate(int k, int l) {
		total=k*l;		
	}
	
}
