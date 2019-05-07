package com.literary.base;

public interface BaseMapper<T> {
    public T findById(Integer id);
    public T findByUuid(String uuid);
    public void deletebyId(Integer id);
    public void deletebyUuid(String uuid);
    public void save(T entity);
    public void update(T entity);
}
