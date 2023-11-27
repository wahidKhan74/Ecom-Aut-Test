public class Executor {

    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));  
    }  

    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));  
    }  
}