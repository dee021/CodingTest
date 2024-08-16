import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder answer = new StringBuilder();
        for (int c = 0; c < a; c++)
            answer.append("*");
        for (int r = 0; r < b; r++){
            System.out.println(answer);
        }
        
        
    }
}