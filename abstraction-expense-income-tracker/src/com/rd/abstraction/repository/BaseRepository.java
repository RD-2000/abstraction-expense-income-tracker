package com.rd.abstraction.repository;


import java.util.List;

public abstract class BaseRepository<T> {
    public abstract void save(T obj);
    public abstract T get(int id);
    public abstract List<T> getAll();
}


