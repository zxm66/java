
/*
 *
 * Copyright (c) 2017 kinva.cc, Inc. All Rights Reserved
 *
 * @author zhangxiaomin(1396729865@qq.com)
 *
 */
public class Solution {

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

	public static void main(String[] args) {
		int[] digits = {8,9,9};
	    int[] result = new Solution().plusOne(digits);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println(result);

	}
}
