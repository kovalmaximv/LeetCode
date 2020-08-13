package LeetCode.HashTable.Medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DisplayTableFoodOrdersRestaurant {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Set<String> meals = new TreeSet<>();
        Map<Integer, Map<String, Integer>> data = new TreeMap<>();
        for(List<String> order: orders) {
            Integer table = Integer.parseInt(order.get(1));
            if (!data.containsKey(table)) {
                data.put(table, new HashMap<>());
            }

            Map<String, Integer> tableOrder = data.get(table);
            String meal = order.get(2);
            meals.add(meal);
            if (!tableOrder.containsKey(meal)) {
                tableOrder.put(meal, 1);
            } else {
                tableOrder.put(meal, tableOrder.get(meal) + 1);
            }
        }

        List<List<String>> result = new LinkedList<>();
        result.add(new LinkedList<>());
        result.get(0).add("Table");
        result.get(0).addAll(meals);
        for (Map.Entry<Integer, Map<String, Integer>> table: data.entrySet()) {
            List<String> tableData = new LinkedList<>();
            tableData.add(String.valueOf(table.getKey()));

            for (String meal: meals) {
                Integer count = table.getValue().get(meal);
                if (count == null) {
                    count = 0;
                }
                tableData.add(String.valueOf(count));
            }

            result.add(tableData);
        }

        return result;
    }
}
