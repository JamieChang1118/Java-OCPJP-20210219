package com.ocp.day20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class SortedDemo3 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("A" , 100),
                new User("B" , 40),
                new User("C" , 80),
                new User("D" , 30),
                new User("E" , 90)
        );
        System.out.println(users);
        
        // 請按照分數高到低排序並置入一個新集合中
        List<User> reversedUsers = users.stream().sorted((o1 , o2) -> o2.getScore() - o1.getScore()).collect(toList());
        System.out.println(reversedUsers);
        
        // 請按照分數低到高排序並置入一個新集合中
        List<User> sortedUsers = users.stream()
                //.sorted(Comparator.comparingInt(s -> s.getScore()))
                .sorted(Comparator.comparingInt(User::getScore))
                .collect(toList());
        System.out.println(sortedUsers);
        
        
    }
}
