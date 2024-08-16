class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++){
            answer[i] = bin(n, Integer.toBinaryString(arr1[i]), Integer.toBinaryString(arr2[i]));
        }
        return answer;
    }
    
    String bin(int n, String bin1, String bin2){
        bin1 = "0000000000000000".substring(0, n-bin1.length()) + bin1;
        bin2 = "0000000000000000".substring(0, n-bin2.length()) + bin2;
        String res="";
        for (int i = 0; i < n; i++){
            if (bin1.charAt(i) == '1' || bin2.charAt(i) == '1') res += "#";
            else res += " ";
        }
        return res;
    }
    
    
}