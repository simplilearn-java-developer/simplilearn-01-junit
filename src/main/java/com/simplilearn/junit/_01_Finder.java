package com.simplilearn.junit;

public class _01_Finder {

    int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] > max ) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

    	/*
    	 * Test Positive Values
    	 */

        int[] arr = {1,3,4,2};

        _01_Finder finder = new _01_Finder();

        int max = finder.findMax(arr);

        if ( max == 4 ) {
            System.out.println("Test1 Successful");
        }
        else {
            System.err.println("Test1 Unsuccessful");
        }

        /*
         * Test Negative Values
         */
        
        arr = new int[] {-12,-1,-3,-4,-2};
                
        max = finder.findMax(arr);
        
        if ( max == -1 ) {
        	System.out.println("Test2 Successful");
        }
        else {
        	System.err.println("Test2 Unsuccessful");
        }
        
    }
}
