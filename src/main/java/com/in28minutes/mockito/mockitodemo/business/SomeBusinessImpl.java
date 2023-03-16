package com.in28minutes.mockito.mockitodemo.business;

import java.util.Arrays;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMaxFromAllData(){
        int[] data=dataService.retrieveAllData();

        return Arrays.stream(data).max().orElse(Integer.MIN_VALUE);

    }
}


interface DataService {
    int[] retrieveAllData();
}