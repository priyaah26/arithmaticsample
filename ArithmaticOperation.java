package org.seleniumbatch4;

public class ArithmaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmaticCalculation num = new ArithmaticCalculation();
		num.addTwoNum();
		num.subTwoNum();
		num.MulTwoNum();
		num.divTwoNum();

	}

}

class ArithmaticCalculation {
	
	public void addTwoNum() {
		int a = 50, b=20;
		int c = a+b;
		System.out.println(c);
	}
	
	public void subTwoNum() {
		int d = 50, e=20;
		int f = d-e;
		System.out.println(f);
	}
	
	public void MulTwoNum() {
		int g = 50, h=20;
		int i = g*h;
		System.out.println(i);
	}
	
	public void divTwoNum() {
		int j = 50, k=20;
		float l = j/k;
		System.out.println(l);
	}
	
}