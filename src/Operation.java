
public class Operation {

	private int total=0; 
	
	public void add(int operator1, int operator2) {
		total=operator1+operator2;
	}

	public void substract(int operator1, int operator2) {
		total=operator1-operator2;
	}

	public void multiplicate(int operator1, int operator2) {
		total=operator1*operator2;		
	}

	public void division(int operator1, int operator2) {
		total=operator1/operator2;
	}
	
	public int total() {
		return total;
	}
}
