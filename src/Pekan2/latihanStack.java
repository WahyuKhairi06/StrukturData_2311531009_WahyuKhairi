package Pekan2;
import java.util.*;
public class latihanStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(42);
		s.push(-3);
		s.push(17);
		System.out.println("Nilai Stack = " + s);
		System.out.println("Nilai Pop = " + s.pop());
		System.out.println("Nilai Stack Setelah pop = " + s);
		System.out.println("Nilai Peek = " + s.peek());
		System.out.println("Nilai Stack setelah peek = " + s);
	}

}