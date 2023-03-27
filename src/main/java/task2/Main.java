package task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameCounts = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedNameCounts = new ArrayList<>(nameCounts.entrySet());
        Collections.sort(sortedNameCounts, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : sortedNameCounts) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}



