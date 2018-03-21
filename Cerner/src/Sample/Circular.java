package Sample;
import java.util.*;
public class Circular {
public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<Integer>();
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	int x = q.poll();
	q.add(x);
	for(int h:q)
	{
		System.out.println(h);
	}
}
}
