package org.example;

public class DependencyContainer {
    public IDataBaseManager createDataBaseManager() {
        return new DataBaseManager();
    }

    public IAuthenticator createAuthenticator(IDataBaseManager dbManager) {
        return new Authenticator(dbManager);
    }

    public IOrderManager createOrderManager(IDataBaseManager dbManager) {
        return new OrderManager(dbManager);
    }

    public IPaymentProcessor createPaymentProcessor() {
        return new PaymentProcessor();
    }
}
