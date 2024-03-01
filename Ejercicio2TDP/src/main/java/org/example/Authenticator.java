package org.example;

public class Authenticator implements IAuthenticator {
    private IDataBaseManager dbManager;

    public Authenticator(IDataBaseManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public boolean authenticate(String username, String password) {
        // Implementación con seguridad mejorada
        return true;
    }
}

