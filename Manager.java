package Ejercicio_2;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Manager {

	Fibonacci fibonacci = new Fibonacci();
	List<Integer> list = fibonacci.getList();
	Splitter split = new Splitter(list);
	List<Integer> even = split.getEven();
	List<Integer> odd = split.getOdd();
	
	public Manager() {
		
	}
	
	public void run() {
		try {
			PrintWriter writerEven = new PrintWriter("even.data");
			PrintWriter writerOdd = new PrintWriter("odd.data");
			writerEven.println(even);
			writerOdd.println(odd);
			writerEven.close();
			writerOdd.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
