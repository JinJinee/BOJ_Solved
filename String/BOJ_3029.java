// 경고
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3029 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), ":");

        int nowH = Integer.parseInt(st.nextToken());
        int nowM = Integer.parseInt(st.nextToken());
        int nowS = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ":");

        int targetH = Integer.parseInt(st.nextToken());
        int targetM = Integer.parseInt(st.nextToken());
        int targetS = Integer.parseInt(st.nextToken());

        int warnH, warnM, warnS;

        if(targetS < nowS){
            targetM--;
            warnS = (60+targetS - nowS);
        }else{
            warnS = targetS - nowS;
        }

        if(targetM < nowM){
            targetH--;
            warnM = (60+targetM - nowM);
        }else{
            warnM = targetM - nowM;
        }

        if(targetH < nowH){
            warnH = (24+targetH - nowH);
        }else{
            warnH = targetH - nowH;
        }

        if(warnH == 0 && warnM == 0 && warnS == 0){
            System.out.println("24:00:00");
        }else{
            System.out.println(String.format("%02d", warnH) + ":" + String.format("%02d", warnM) + ":" + String.format("%02d", warnS));
        }

        

    }
}
