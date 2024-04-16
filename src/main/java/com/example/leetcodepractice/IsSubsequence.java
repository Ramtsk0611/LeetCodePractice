package com.example.leetcodepractice;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int max=0;
        String newString=t;
        for(int i=0;i<s.length();i++){
            newString=newString.substring(max,newString.length());
            int index=newString.indexOf(s.charAt(i));
            if(index>=0){
                max=index+1;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc"; String t = "ahbgdc";
//        String s = "acb"; String t = "ahbgdc";
//        String s = "axc"; String t = "ahbgdc";
//        String s = ""; String t = "ahbgdc";
//        String s = "b"; String t = "c";
        System.out.println(new IsSubsequence().isSubsequence(s,t));
    }
}
