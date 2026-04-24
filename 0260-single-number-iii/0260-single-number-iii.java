class Solution {
    public int[] singleNumber(int[] nums) {

        // Step 1: XOR all numbers
        // duplicates cancel, leaving unique1 ^ unique2
        int xor = 0;

        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];
        }


        // Step 2:
        // Get rightmost set bit where the two unique numbers differ
        int mask = xor & (-xor);


        // Step 3:
        // These will store the two answers
        int firstUnique = 0;
        int secondUnique = 0;


        // Step 4:
        // Split numbers into two groups using that bit
        for(int i = 0; i < nums.length; i++){

            // Check whether this bit is OFF
            if( (nums[i] & mask) == 0 ){

                // Goes in first group
                firstUnique = firstUnique ^ nums[i];

            }
            else{

                // Goes in second group
                secondUnique = secondUnique ^ nums[i];

            }
        }


        // Step 5:
        // return both single numbers
        int[] result = new int[2];
        result[0] = firstUnique;
        result[1] = secondUnique;

        return result;
    }
}