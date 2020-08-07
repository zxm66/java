import java.util.ArrayList;
import java.util.List;

/*
 *
 * Copyright (c) 2017 kinva.cc, Inc. All Rights Reserved
 *
 * @author zhangxiaomin(1396729865@qq.com)
 *
 */
public class Solution {
	
	/**
	 * array plus one
	 **/
    public int[] plusOne(int[] digits) {

        int number1 = (digits[digits.length -1 ] + 1)/10;
		int number2 = (digits[digits.length - 1] + 1)% 10; 
        digits[digits.length -1] = number2 ;
        for (int i=digits.length -2 ;i >= 0 ; i--){
			number2 = (digits[i] + number1) % 10;
			number1 = (digits[i] + number1) / 10;
		    digits[i] = number2;

        }
        if(number1 > 0){
            int[] result = new int[digits.length + 1];
            result[0] = number1;
            for (int i = 1;i < result.length ;i++){
                result[i] = digits[i-1];
            }
            return result;
        }
        return digits;
    }

	/**
	 * 两个数组的交集
	 **/
    public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
		if(nums1.length <=  nums2.length){
			for (int i = 0; i < nums1.length; i++) {
				
			}
		}else{
			for (int i = 0; i < nums2.length; i++) {
				
			}

		}

		int[] result  = new int[list.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		
		return result;
    }

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {1,2,3};
		int[] result = new Solution().intersect(nums1, nums2);
		System.out.println(result);
	}
}
