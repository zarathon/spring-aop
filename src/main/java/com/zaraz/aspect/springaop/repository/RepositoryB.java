package com.zaraz.aspect.springaop.repository;

import org.springframework.stereotype.Repository;


/**
 * Created by zara on 01/11/17.
 */

@Repository
public class RepositoryB {

    public String retrieveSomething(){
        return "Data from repository B";
    }

}
