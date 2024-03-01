package org.example;

public interface IAuthenticator {
    boolean authenticate(String username, String password);
}