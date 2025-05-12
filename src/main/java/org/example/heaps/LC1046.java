package org.example.heaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LC1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compare);

        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size()>1){
            int y = pq.poll();
            int x = pq.poll();

            if(x!=y) pq.add(y-x);
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
