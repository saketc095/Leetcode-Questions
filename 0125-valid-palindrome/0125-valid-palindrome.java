class Solution {
    public boolean isPalindrome(String s) {
        if(s == null) { return true;    }
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        String res = str.toLowerCase();

        int left = 0;
        int right = res.length()-1;

        while(left < right){
            if(res.charAt(left) != res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}