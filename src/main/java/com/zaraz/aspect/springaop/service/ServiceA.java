package com.zaraz.aspect.springaop.service;

import com.zaraz.aspect.springaop.repository.RepositoryA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zara on 01/11/17.
 */
@Service
public class ServiceA {

    @Autowired
    private RepositoryA repositoryA;

    public String doSomething(){
        //Business Logic here
        return "Service A: "+ repositoryA.retrieveSomething();
    }
}
