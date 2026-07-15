class pallindrome {
    public boolean isPalindrome(int x) {
        String str= String.valueOf(x);
        String n ="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            n+=c;
        }
        if(str.equals(n)){
            return true;
        }else{
            return false;
        }
    }
}
