class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int k = s1.length(); int left=0; int right = 0;
        int[] s1Arr = new int[26]; int[] s2Arr = new int[26];

        for(int i=0; i<k; i++){
            s1Arr[s1.charAt(i) - 'a']++;
        }

        for(right=0; right<s2.length(); right++){
            //shrinking the window when it exceeds k
            if(right-left+1 > k){
                s2Arr[s2.charAt(left) - 'a']--;
                left++;
            }

            //expanding the window
            s2Arr[s2.charAt(right) - 'a']++;

            if(right-left+1 == k){
                if(Arrays.equals(s1Arr,s2Arr))
                return true;
            }
        }
        return false; 
    }
}