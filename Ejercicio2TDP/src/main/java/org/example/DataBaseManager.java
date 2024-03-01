package org.example;

public class DataBaseManager implements IDataBaseManager {
    @Override
    public void create(Object data) {
        // Implementación con manejo de errores
    }

    @Override
    public Object read(String query) {
        // Implementación
        return new Object();
    }

    @Override
    public void update(Object data) {
        // Implementación
    }

    @Override
    public void delete(String query) {
        // Implementación
    }

    private void logError(String message, Exception e) {
        System.err.println(message + ": " + e.getMessage());
    }
}
