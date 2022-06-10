package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p12018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 전체 과목 수
        int m = Integer.parseInt(st.nextToken()); // 내 마일리지
        int[] arr = new int[n];
        int cnt = 0;

        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken()); // 수강 신청 인원
            int L = Integer.parseInt(st.nextToken()); // 수강 가능 인원
            st = new StringTokenizer(br.readLine());
            if(P >= L){
                int[] subArr = new int[P];
                for(int j = 0 ; j < P; j++) subArr[j] = Integer.parseInt(st.nextToken());
                Arrays.sort(subArr);
                arr[i] = subArr[P - L];
            }else{
                arr[i] = 1;
            }
        }

        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > m) break;
            m -= arr[i];
            cnt++;
        }
        System.out.println(cnt);
    }
}
