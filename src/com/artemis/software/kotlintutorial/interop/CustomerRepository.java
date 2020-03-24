package com.artemis.software.kotlintutorial.interop;

import com.artemis.software.kotlintutorial.classes.CustomerJava;

import java.util.List;

public interface CustomerRepository {

    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
