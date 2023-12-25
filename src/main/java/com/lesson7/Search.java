package com.lesson7;
import java.util.ArrayList;
import java.util.List;


public class Search<T> {

    private List<T> data;
    private Pagination pagination;

    public Search() {
        this.data = new ArrayList<>();
        this.pagination = new Pagination(10, 10,10);
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
