package com.gizaSystem.service;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.modules.junit4.PowerMockRunner;
//import org.powermock.reflect.Whitebox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@PrepareForTest(Class.class)
public class StatisticsServiceTest {

    @Mock
    UserService userServiceMock;

    @InjectMocks
    StatisticsService statisticsService;

    @BeforeEach
    public void init() {
        System.out.println("before each test");
    }

    @BeforeAll
    public static void initAll() {
        System.out.println("before all test");
    }

    @AfterEach
    public void teardown() {
        System.out.println("after each test");
    }

    @AfterAll
    public static void teardownAll() {
        System.out.println("after all test");
    }
    @Test
    void user_count_percent_is_20() {

        System.out.println("user_count_percent_is_20 test");

        doReturn(10).when(userServiceMock).getUsersCount();

        double actual = statisticsService.usersCountPercent();

        assertEquals(20,actual);
    }

    @Test
    void say_hello_successfully() {


//        Class s = mock(Class.class);

        System.out.println("say_hello_successfully test");
        String actual = statisticsService.sayHello();

        assertEquals("hello",actual);
    }

    @Test
    public void testMockClassClass() throws Exception {
        // Mock the behavior of Class.class
        PowerMockito.mockStatic(Class.class);

        // Mock the behavior of getName() method
        PowerMockito.when(Class.class.getName()).thenReturn("MockedClassName");

        // Use the mocked behavior
        String className = Class.class.getName();

        // Verify the result
        System.out.println("Class Name: " + className); // This should print "Class Name: MockedClassName"
    }
//    @Test
//    void get_8_when_mul_4_by_2() throws Exception {
//        System.out.println(statisticsService);
//// Mock any necessary behavior
//        PowerMockito.when(statisticsService, "mulBy2", Mockito.anyInt()).thenCallRealMethod();
//        int actual = Whitebox.invokeMethod(statisticsService,"mulBy2",4);
//        assertEquals(8,actual);
//    }
}
