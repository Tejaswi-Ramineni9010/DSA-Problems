class Solution {
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String str="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    if(str.length()<(j-i+1)){
                        str=s.substring(i,j+1);
                    }
                }
            }
        }
        return str;

        
    }
}