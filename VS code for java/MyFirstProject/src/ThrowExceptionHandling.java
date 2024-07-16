import java.util.concurrent.ArrayBlockingQueue; 
import java.util.concurrent.BlockingQueue; 
 
class Producer implements Runnable { 
private final BlockingQueue<Integer> queue; private int count; 
 
public Producer(BlockingQueue<Integer> queue) { 
this.queue = queue; this.count = 0; 
} 
 
 
@Override 
public void run() { try { 
while (count < 7) { 
Thread.sleep(1000); // Simulating time taken to produce an item queue.put(count); 
System.out.println("Produced: " + count); count++; 
} 
// Adding stop code to indicate end of production queue.put(-1); 
} catch (InterruptedException e) { 
Thread.currentThread().interrupt(); 
} 
} 
} 
 
 
class Consumer implements Runnable { 
private final BlockingQueue<Integer> queue; 
 
public Consumer(BlockingQueue<Integer> queue) { 
this.queue = queue; 
} 
 
 
@Override 
public void run() { try { while (true) { int item = queue.take(); if (item == -1) { break; // Stop code received, exit the loop 
} 
System.out.println("Consumed: " + item); 
Thread.sleep(2000); // Simulating time taken to consume an item 
} 
} catch (InterruptedException e) { 
Thread.currentThread().interrupt(); 
} 
} 
} 
 
public class ThrowExceptionHandling { 
public static void main(String[] args) { 
BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); 
 
 
Producer producer = new Producer(queue); 
Consumer consumer = new Consumer(queue); 
 
Thread producerThread = new Thread(producer); 
Thread consumerThread = new Thread(consumer); 
 producerThread.start(); consumerThread.start(); 
 try { 
producerThread.join(); consumerThread.join(); 
} catch (InterruptedException e) { 
e.printStackTrace(); 
} 
 
 
System.out.println("Program terminated."); 
} 
} 
