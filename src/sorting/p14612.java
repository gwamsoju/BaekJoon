package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p14612 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Order> orders = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){

            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()){
                case "order":
                    orders.add(new Order(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
                    for(int j = 0 ; j < orders.size(); j++){
                        System.out.print(orders.get(j).table + " ");
                    }
                    System.out.println();
                    break;

                case "sort":
                    Collections.sort(orders, new Comparator<Order>(){
                        @Override
                        public int compare(Order order1, Order order2) {
                             return order1.time - order2.time;
                        }
                    });
                    for(int j = 0 ; j < orders.size(); j++){
                        System.out.print(orders.get(j).table + " ");
                    }
                    System.out.println();
                    break;

                case "complete":
                    int table = Integer.parseInt(st.nextToken());
                    for(int j = 0 ; j < orders.size(); j++){
                        if(orders.get(j).table == table){
                            orders.remove(j);
                            break;
                        }
                    }
                    if(orders.size() == 0){
                        System.out.println("sleep");
                    }else{
                        for(int j = 0 ; j < orders.size(); j++){
                            System.out.print(orders.get(j).table + " ");
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}

class Order{
    int table;
    int time;

    Order(int table, int time){
        this.table = table;
        this.time = time;
    }

    public int getTable(){
        return table;
    }

    @Override
    public String toString() {
        return "Order{" +
                "table=" + table +
                ", time=" + time +
                '}';
    }
}
