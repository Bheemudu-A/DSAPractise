package practise.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummarizingIntExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Arnold", "Bob", "Charlie", "David");

        Map<Character, IntSummaryStatistics> statsByInitial = names.stream()
                                                                   .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.summarizingInt(String::length)));

        System.out.println("Statistics by initial: " + statsByInitial);
        // Output example: {A=IntSummaryStatistics{count=2, sum=11, min=5, average=5.5, max=6}, B=..., C=..., D=...}
    }
}