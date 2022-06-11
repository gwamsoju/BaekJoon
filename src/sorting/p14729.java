package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p14729 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double[] scoreArr = new double[N];

        for(int i = 0 ; i < N; i++){
            scoreArr[i] = Double.parseDouble(br.readLine());
        }

        Arrays.sort(scoreArr);

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 7; i++){
            sb.append(String.format("%.3f\n",scoreArr[i]));
        }
        System.out.println(sb);

    }
}
