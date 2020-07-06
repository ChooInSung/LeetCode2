package myPackge;

public class RemoveElement27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement27 main = new RemoveElement27();
		int[] nums = {3,2,2,3};
		System.out.println(main.removeElement(nums, 3));
	}

	// my first approach : wrong
	public int removeElement(int[] nums, int val) {
		if(nums==null || nums.length==0) {
			return 0;
		}
		
		int count=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==val) {
				count++;
				for(int j=i;j<nums.length-1;j++) {
					nums[j]=nums[j+1];
				}
			}
		}
		
		return count;
	}
	
	//my second approach : leetcode solution1
	public int removeElement2(int[] nums, int val) {
		if(nums==null || nums.length==0) {
			return 0;
		}
		
		int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[j] = nums[i];
				j++;
			}
		}
		
		return j;
	}
	
	//my second approach : leetcode solution2
	public int removeElement3(int[] nums, int val) {
	    int i=0;
	    int n=nums.length;
	    
	    while(i<n) {
	    	if(nums[i]==val) {
	    		nums[i] = nums[n-1];
	    		n--;
	    	}
	    	else {
	    		i++;
	    	}
	    }
	    
	    return n;
	}
}
