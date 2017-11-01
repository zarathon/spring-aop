package com.zaraz.aspect.springaop.service;

import com.zaraz.aspect.springaop.repository.RepositoryB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zara on 01/11/17.
 */
@Service
public class ServiceB {

    @Autowired
    private RepositoryB repositoryB;

    public String doSomething(){
        //Business Logic here
        return "Service B: "+ repositoryB.retrieveSomething();
    }
}
