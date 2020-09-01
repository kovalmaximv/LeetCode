package LeetCode.Graph.Medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

// https://leetcode.com/problems/reconstruct-itinerary/
// Medium
// Problem: 3

public class ReconstructItinerary {
    Map<String, PriorityQueue<String>> data = new HashMap<>();
    List<String> result = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket: tickets) {
            data.computeIfAbsent(ticket.get(0), x -> new PriorityQueue<>()).add(ticket.get(1));
        }
        visit("JFK");

        return result;
    }

    private void visit(String airport) {
        while (data.containsKey(airport) && !data.get(airport).isEmpty()) {
            visit(data.get(airport).poll());
        }
        result.add(0, airport);
    }
}
