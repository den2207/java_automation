package com.lesson7;

public class Pagination {
    int limit;
    int offset;
    int total;

    public Pagination(int limit, int offset, int total) {
        this.limit = limit;
        this.offset = offset;
        this.total = total;
    }

    public int setLimit(int limit) {
        return limit;
    }

    public int setOffset(int offset) {
        return offset;
    }

    public int setTotal(int total) {
        return total;
    }
}
