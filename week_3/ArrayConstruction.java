public class ArrayConstruction {
    int[] runningSum(int[] nums) 
    {
        for(int i=1;i<nums.length;i++)
        {
            nums[i] = nums[i] + nums[i-1];
        }    
        return nums;
    }
    int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X")){
                x=x+1;
            }
            else if(operations[i].equals("X++")){
                x=x+1;
            }
            else if(operations[i].equals("--X")){
                x=x-1;
            }
            else if(operations[i].equals("X--")){
                x=x-1;
            }
            else {
                continue;
            }
        }
        return x;
    }
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*(nums.length)];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
