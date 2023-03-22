package Ejercicio_2;
import java.util.List;
import java.util.ArrayList;

public class Splitter {
	List<Integer> list;
	List<Integer> even = new ArrayList<Integer>();
	List<Integer> odd = new ArrayList<Integer>();
	
	public Splitter(List<Integer> list) {
		this.list = list;
		fillEven();
		fillOdd();
	}
	
	private void fillEven() {
		for(int i=0; i<list.size(); i++) if(list.get(i) % 2 == 0) even.add(list.get(i));
	}
	
	private void fillOdd() {
		for(int i=0; i<list.size(); i++) if(list.get(i) % 2 != 0) odd.add(list.get(i));
	}
	
	public List<Integer> getEven() {
		return even;
	}
	
	public List<Integer> getOdd() {
		return odd;
	}
}
