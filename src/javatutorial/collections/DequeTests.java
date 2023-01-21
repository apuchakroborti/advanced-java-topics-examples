package javatutorial.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTests {
    Deque<Integer> dq = new ArrayDeque<>();
    
    void test(){
        dq.add(10);
        System.out.println("DQ: "+dq.toString());
        dq.add(20);
        System.out.println("DQ: "+dq.toString());
        dq.add(30);
        System.out.println("DQ: "+dq.toString());
        dq.add(40);
        System.out.println("DQ: "+dq.toString());
        
        dq.addFirst(50);
        System.out.println("DQ: "+dq.toString());
        dq.addLast(100);
        System.out.println("DQ: "+dq.toString());
        
        dq.remove();
        System.out.println("DQ: "+dq.toString());
        
        dq.removeFirst();
        System.out.println("DQ: "+dq.toString());
        
        dq.removeLast();
        System.out.println("DQ: "+dq.toString());
    }
    
}
