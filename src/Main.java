public class Main {
    
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,Calculation.cube(3));  
    }  
    @Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        assertEquals("ym eman si nahk",Calculation.reverseWord("my name is khan");  
    }  

}