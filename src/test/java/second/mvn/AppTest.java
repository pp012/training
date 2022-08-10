package second.mvn;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
	Measurement m=new Measurement(3);
    @Test
    public void measurement()
    {
    	
        assertEquals( 3,m.value );
    }
    @Test 
    public void testAdd()
    {
    	m.add(m);
    	assertEquals(6, m.value);
    }
    public void testSub()
    {
    	m.sub(m);
    	assertEquals(0, m.value);
    }
}
