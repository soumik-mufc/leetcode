class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k == 0)
            return num;
        if(k == n)
            return "0";
        
        int i = 0;
        while(k-- > 0) {
            i = 0;
            n = num.length();
            boolean entered = false;
            for(; i < n - 1; i++) {
                if(num.charAt(i) > num.charAt(i+1)) {
                    num = num.substring(0, i) + num.substring(i+1);
                    entered = true;
                    break;
                }
            }
            if(!entered)
                break;
        }
        k++;
        System.out.println(k + " = " + num);
        while(k-- > 0) {
            n = num.length();
            char lar = num.charAt(0);
            int idx = 0;
            i = 0;
            for(; i < n ; i++) {
                if(num.charAt(i) > lar) {
                    lar = num.charAt(i);
                    idx = i;
                }
            }
            num = num.substring(0, idx) + num.substring(idx+1);
        }
        num = num.replaceFirst ("^0*", "");
        if(num.equals(""))
            num = "0";
        return num;
    }
}