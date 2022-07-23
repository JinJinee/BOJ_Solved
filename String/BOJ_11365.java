// !밀비 급일
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11365 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf;

        String str = "";
        

        while(true){
            str = br.readLine();

            if(str.equals("END")){
                break;
            }

            sbf = new StringBuffer(str);
            sb.append(sbf.reverse().toString()).append("\n");

        }

        System.out.println(sb);
    }
    
}
