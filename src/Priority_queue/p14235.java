package Priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p14235 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            if(a > 0){
                for(int j = 0 ; j < a; j++){
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }else{
                if(pq.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(pq.poll());
                }
            }
        }
    }
}
