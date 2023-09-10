package com.gizaSystem.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AbstractClassTestEx {

    @Mock
    AbstractClassEx abstractClassEx;

    @Spy
    AbstractClassEx abstractClassEx2;

    @Test
    public void testing_usingSpy() {

        String res = abstractClassEx2.sayHi();
        assertEquals("hi", res);
    }
    @Test
    public void testing_usingMock() {

        doCallRealMethod().when(abstractClassEx).sayHello();
        doReturn("test").when(abstractClassEx).getName();
        assertEquals("Hii.. test!!", abstractClassEx.sayHello());
    }
}
