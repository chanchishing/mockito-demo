package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock=mock(DataService.class);

    @InjectMocks
    private SomeBusinessImpl someBusinessImpl;

    @Test
    void findMaxFromAllData_basicTest() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25,15,5});

        assertEquals(25, someBusinessImpl.findMaxFromAllData());
    }

    @Test
    void findMaxFromAllData_OneValueTest() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25});

        assertEquals(25, someBusinessImpl.findMaxFromAllData());
    }

    @Test
    void findMaxFromAllData_EmptyTest() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertThrows(Exception.class,()->someBusinessImpl.findMaxFromAllData());
    }

}

