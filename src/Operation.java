
public class Operation {

	private int total=0; 
	
	public void add(int a, int b) {
		total=a+b;
	}

	public void substract(int i, int j) {
		total=i-j;
	}

	public void multiplicate(int k, int l) {
		total=k*l;		
	}

	public void division(int m, int n) {
		total=m/n;
	}
	
	public int total() {
		return total;
	}
}
