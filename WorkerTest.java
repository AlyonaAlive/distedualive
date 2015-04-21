import static org.junit.Assert.*;

import org.junit.Assert.*;
import org.junit.Test;


public class WorkerTest {

		
	@Test
    public void testAdd() throws InterruptedException {
		Data    d = new Data();

        Worker w3=new Worker(3, d);
        Worker w2=new Worker(2, d);
        Worker w1=new Worker(1, d);

        w2.join();
        String s = "Tic-Tak-Toy";
              
        assertEquals("nullTic-Tak-Toy", d.testString);
      
    }

}
