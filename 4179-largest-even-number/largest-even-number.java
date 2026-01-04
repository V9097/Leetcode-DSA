class Solution {
    public String largestEven(String s) {
        int n=s.length();
        int index;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                index=i;
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}