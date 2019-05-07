package com.literary.base;

public interface IBaseService<T> {
    public T findByID(Integer id);
    public T findByUuid(String uuid);
    public void save(T entity);
    public void update(T entity);
}
