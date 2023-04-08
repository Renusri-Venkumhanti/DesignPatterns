package MediumProblems;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(isPalindrome(121));
      System.out.println(isStrictlyPalindromic(9));

	}
	public static boolean isPalindrome(int x) {
		
        int temp =0;
        int temp1=x;
        while(x>0){
            temp = (temp*10)+(x%10);
            x/=10;
        }
        if(temp==temp1){
        return true;
        }
        return false;
       
    }
	public static boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            int temp =n;
            StringBuilder res=new StringBuilder();
            StringBuilder res1=new StringBuilder();
            while(temp>=i){
                res.append(temp%i);
                temp/=i;
            }
            res.append(temp);
            res1.append(res);
            res.reverse();
            if(!res1.toString().equals(res.toString()))
               return false;
        }
       return true;
    }
	
	 public int maxArea(int[] height) {
	        int left = 0;
	        int right = height.length - 1;
	        int max = 0;
	        while(left < right){
	            int w = right - left;
	            int h = Math.min(height[left], height[right]);
	            int area = h * w;
	            max = Math.max(max, area);
	            if(height[left] < height[right]) left++;
	            else if(height[left] > height[right]) right--;
	            else {
	                left++;
	                right--;
	            }
	        }
	        return max;
	 }

}

