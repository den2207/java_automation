package com.lesson7;

public class Main {
    public static void main(String[] args) {
        Search<User> search = new Search<>();

        User user1 = new User("1", "1", "1", false);
        User user2 = new User("2", "2", "2", true);

        search.getData().add(user1);
        search.getData().add(user2);

        search.getPagination().setLimit(10);
        search.getPagination().setOffset(20);
        search.getPagination().setTotal(200);

        System.out.println(search.getData());
    }
}
