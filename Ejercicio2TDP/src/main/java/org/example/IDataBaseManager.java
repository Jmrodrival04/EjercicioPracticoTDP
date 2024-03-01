package org.example;

public interface IDataBaseManager {
    void create(Object data);
    Object read(String query);
    void update(Object data);
    void delete(String query);
}