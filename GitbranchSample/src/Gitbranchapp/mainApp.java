package Gitbranchapp;

public class mainApp {
	public static void main(String[] args) {
		
	
	//這是第二次測試版本
    Math cmath = new Math();
    System.out.println();
    System.out.println(cmath.add(10,20));
    
	}
}
class Math{
	int add(int a, int b) {
		return a+b;
	}
}