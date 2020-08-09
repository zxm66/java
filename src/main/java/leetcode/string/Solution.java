
public class Solution{

	public void reverseString(char[] s) {
		int i = 0;
		int j = s.length - 1;
		char c ;
		while(i < j){
			c = s[i] ;
			s[i] = s[j];
			s[j] = c;
			i ++;
			j --;
		}

	}
	public static void main(String[] args) {
		char[] helloWorld = {'h','w'};
		System.out.println(helloWorld);
		new Solution().reverseString(helloWorld);
		System.out.println(helloWorld);

	}


}
