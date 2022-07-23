// 숫자의 합
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String num = br.readLine();

        int result = 0;

        for(int i=0; i<N; i++){
            result += Integer.parseInt(Character.toString(num.charAt(i)));
        }

        System.out.println(result);
    }
}
