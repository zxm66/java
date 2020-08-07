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

    public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
		int number = 0;
		if(nums1.length <=  nums2.length){
			for (int i = 0; i < nums1.length; i++) {
				for (int j = number; j < nums2.length; j++) {
					 if(nums1[i]== nums2[j]){
						 list.add(nums1[i]);
						 int tmp = nums1[i];
						 for (int j2 = j; j2 > 0; j2 --) {
						 	nums2[j2] = nums2[j2-1];
						 }
						 nums2[0] = tmp;
						 number += 1;
						 break;
					 }
				}
			}
		}else{
			for (int i = 0; i < nums2.length; i++) {
				for (int j = number; j < nums1.length; j++) {
					if(nums1[j]== nums2[i]){
						 list.add(nums1[j]);
						 int tmp = nums1[j];
						 for (int j2 = j; j2 > 0; j2 --) {
						 	nums1[j2] = nums1[j2-1];
						 }
						 nums1[0] = tmp;
						 number += 1;
						 break;
					 }				
				}
			}

		}

		int[] result  = new int[list.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
			System.out.println(result[i]);
		}
		return result;
    }

    public int singleNumber(int[] nums) {
		int result = 0;	
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] == nums[j]){
					nums[i] = 0;
					nums[j] = 0;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if( nums[i] != 0){
				result = nums[i];
			}
		}
		return result;
    }


	public boolean containsDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] == nums[j]){
					return true;
				}
			}
		}
		return false;
    }

    public void rotate(int[] nums, int k) {
		
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		boolean result = new Solution().containsDuplicate(nums);
		System.out.println(result);
	}
}
