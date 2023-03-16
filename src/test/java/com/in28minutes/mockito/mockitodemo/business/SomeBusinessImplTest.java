package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplTest {



    @Test
    void findMaxFromAllData_basicScenario() {
        DataServiceStub dataServiceStub=new DataServiceStub();

        SomeBusinessImpl businessImpl   =new SomeBusinessImpl(dataServiceStub);
        assertEquals(3,businessImpl.findMaxFromAllData());
    }
}

class DataServiceStub implements DataService {


    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3};
    }
}
