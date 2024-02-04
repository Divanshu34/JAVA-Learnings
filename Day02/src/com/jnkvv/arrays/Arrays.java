package com.jnkvv.arrays;

public class Arrays {
	int [] arr;
	
	public int[] getConcatenation(int[] nums) {
        //[1,2,1] => [1,2,1,1,2,1]
        //int [] nums = new int[3];
        //returned size = 6
        int n = nums.length; //n = 3
        int [] res = new int[2*n];
        int j = 0;

        for(int i = 0; i < 2*n; i++){
            if(j == n){
                j = 0;
            }
            res[i] = nums[j];
            j++;
        }

        return res;
    }
	
	public int[] reverseArray(int [] nums) {
		int n = nums.length;
		int [] arr = new int [n];
		for(int i = 0; i < n; i++) {
			arr[i] = nums[n-i-1];
		}
		return arr;
	}
	
	public int[] reverseArray1(int[] nums) {
		int start = 0;
		int end = nums.length-1;
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		return nums;
	}
	
	public static void main(String[] args) {
		Arrays a = new Arrays();
		int [] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
//		int [] res = a.getConcatenation(nums);
		int [] res = a.reverseArray1(nums);
		
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
//		
//		for(int i: res) {
//			System.out.println(i);
//		}

		
//		System.out.println(res);
	}
}
