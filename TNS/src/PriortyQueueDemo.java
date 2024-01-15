import java.util.PriorityQueue;

public class PriortyQueueDemo {

	public static void main(String args[]) {
		PriorityQueue pq=new PriorityQueue();
		
			System.out.println(pq.peek());
			for(int i=1;i<=10;i++) {
				pq.offer(i);
			}
			System.out.println(pq);
			System.out.println(pq.peek());
			System.out.println(pq.poll());
			System.out.println(pq);
		
	}
}
