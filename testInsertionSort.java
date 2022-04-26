import static org.junit.Assert.*;

import org.junit.Test;

public class testInsertionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
	}
	
	public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 32;
        arr[2] = 53;
        arr[3] = 369;
        arr[4] = 1;
        
        /** add tests to check for this unit test **/
        sort mySortClass = new sort();
        
        mySortClass.insertionSort(arr, arr.length);
        assertArrayEquals(new int[]{1,32,53,100,369}, arr);
	    
	}

	public void testNegative(){
	   
        int[] arr = new int[7];
        arr[0] = -8;
        arr[1] = -1;
        arr[2] = -6;
        arr[3] = -7;
        arr[4] = -2;
        arr[5] = -10;
        arr[6] = -11;
        
        /** add tests to check for this unit test **/
        sort mySortClass = new sort();
        
        mySortClass.insertionSort(arr, arr.length);
        assertArrayEquals(new int[]{-11, -10, -8, -7, -6, -2, -1}, arr);
	}
    
	public void testMixed(){
        int[] arr = new int[4];
        arr[0] = 64;
        arr[1] = -15;
        arr[2] = 70;
        arr[3] = 110;
        
        /** add tests to check for this unit test **/
        sort mySortClass = new sort();
        
        mySortClass.insertionSort(arr, arr.length);
        assertArrayEquals(new int[]{-15, 64, 70, 110}, arr);
    }

}
