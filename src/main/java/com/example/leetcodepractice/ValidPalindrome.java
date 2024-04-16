package com.example.leetcodepractice;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "").toLowerCase();
        char palindromeArray[] = s.toCharArray();
        for(int i=0;i<s.length()/2;i++){
            if(i<=s.length()-1-i){
                char tmp = palindromeArray[s.length()-1-i];
                palindromeArray[s.length()-1-i] = palindromeArray[i];
                palindromeArray[i]=tmp;
            }
        }
        return (s.equals(new String(palindromeArray)))?true:false;
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
//        obj.isPalindrome("/-+!@#$%^&())\";:[]{}\\ |wetyk 678dfgh");
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
