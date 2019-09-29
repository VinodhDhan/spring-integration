package com.vin.springintegration.endpoints.asynchronousgateway;


import org.springframework.util.concurrent.ListenableFuture;

public interface EnhancedPrinterGateway {

    public void print(Person person);

    public ListenableFuture<String> upperCase(Person person);

}

