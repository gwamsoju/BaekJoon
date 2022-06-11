package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p12034 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb;

        for(int i = 0 ; i < T; i++) {
            sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            ArrayList list1 = new ArrayList();


            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N * 2; j++) {
                list1.add(Integer.parseInt(st.nextToken()));
            }
            ArrayList list2 = (ArrayList)list1.clone();

            for(int j = 0 ; j < list1.size(); j++){
                int price = (int)list1.get(j) + ((int)list1.get(j) / 3);
                for(int k = 0; k < list2.size(); k++){
                    if(price == (int)list2.get(k)){
                        sb.append(list1.get(j) + " ");
                        list2.set(j,0);
                    }
                }
            }
            System.out.println("Case #" + (i+1) + ": " + sb);
        }
    }
}
