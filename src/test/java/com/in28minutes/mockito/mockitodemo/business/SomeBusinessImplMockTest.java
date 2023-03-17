package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {



    @Test
    void findMaxFromAllData_basicTest() {

        DataService dataServiceMock=mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25,15,5});

        assertEquals(25, new SomeBusinessImpl(dataServiceMock).findMaxFromAllData());
    }

    @Test
    void findMaxFromAllData_OneValueTest() {

        DataService dataServiceMock=mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25});

        assertEquals(25, new SomeBusinessImpl(dataServiceMock).findMaxFromAllData());
    }

    @Test
    void findMaxFromAllData_EmptyTest() {

        DataService dataServiceMock=mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});

        assertThrows(Exception.class,()->new SomeBusinessImpl(dataServiceMock).findMaxFromAllData());
    }

}

