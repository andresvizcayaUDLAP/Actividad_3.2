package Ejercicio_2;
import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
	private List<Integer> list = new ArrayList<Integer>();
	
	public Fibonacci() {
		generateNumbers();
	}
	private void generateNumbers() {
		list.add(1);
		list.add(1);
		int count = 2;
		int sum = list.get(count-1);
		while(sum<=1000000) {
			sum += list.get(count-2);
			list.add(sum);
			count++;
		}
	}
	public List<Integer> getList() {
		return list;
	}
}
