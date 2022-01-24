package com.demo.junit;  
  
import static org.junit.Assert.*;  
import com.demo.test.*;  
import org.junit.Test;  
  
public class TestClass {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
          
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}