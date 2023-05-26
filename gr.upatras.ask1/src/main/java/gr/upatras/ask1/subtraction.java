package gr.upatras.ask1;

public class subtraction {
	public String subtract(int x, int y) {
		String res;
		int result=x-y;
		if (result>=0) {res = "positive";} 
		else {res = "negative";} 
		return res;
	}
}
