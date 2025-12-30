package com.in28minutes.spring.learn_spring_framework.enterprise.businessService;

import com.in28minutes.spring.learn_spring_framework.enterprise.dataService.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService{
    @Autowired
    private DataService dataService;
    public long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}