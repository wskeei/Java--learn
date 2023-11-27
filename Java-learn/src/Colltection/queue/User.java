package com.cyx.queue;

public class User implements Comparable<User>{

    private String name;

    private int level; //等级  0-普通用户  1-vip1  2-vip2

    public User(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if(level == o.level) return 0;
        else if(level < o.level) return -1;
        else return 1;
    }
}
