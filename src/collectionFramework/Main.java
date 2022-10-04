package collectionFramework;

import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        for(int i = 0;i<20;i++) list.add(i);
////        list.forEach((element) -> {
//            System.out.println(element);
//        });
//        for(int i = 0;i<list.size();i++) {
//            System.out.println(list.get(i));
//        }
//        list.remove(0);
//        for(int i = 0;i<list.size();i++) {
//            System.out.println(list.get(i));
//        }
//        HashMap<Integer,Integer> map = new HashMap<>();
        int nums[] = {10,1,2,3,4,5,1,2,3,1,4};
//        for(int x : nums) map.put(x,map.getOrDefault(x,0)+1);
//        for(int key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
//        }
//        System.out.println(map.containsKey(1));
//        System.out.println(map.containsValue(1));
//        Map<Integer,Integer> mp = new HashMap<>();
//        for(int x : nums) mp.put(x,mp.getOrDefault(x,0)+1);
//        for(int key : mp.keySet()) {
//            System.out.println(key + " " + mp.get(key));
//        }
//        Stack<Integer> st = new Stack<>();
//        for(int x : nums) st.push(x);
//        while(!st.empty()) {
//            System.out.println(st.peek());
//            st.pop();
//        }
//        Queue<Integer> q = new LinkedList<>();
//        for(int x : nums) q.add(x);
//        while(!q.isEmpty()) {
//            System.out.println(q.peek());
//            q.poll();
//        }
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int x:  nums) pq.add(x);
//        while(!pq.isEmpty()) {
//            System.out.println(pq.peek());
//            pq.poll();
//        }
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for(int x : nums) pq.add(x);
//        while(!pq.isEmpty()) {
//            System.out.println(pq.peek());
//            pq.poll();
//      }
        for(int x : nums) System.out.println(x);
        ArrayList list = new ArrayList<>();
        for(int x : nums) list.add(x);
        Arrays.sort(nums);
        Collections.sort(list);
        int size = nums.length;
        for(int i = 0;i<size;i++) {
            System.out.println(nums[i] + " " + list.get(i));
        }
        System.out.println(list.size());
        e(list);
        System.out.println(list.size());
    }
    static void e(ArrayList<Integer> list) {
        list.add(10);
    }
}
