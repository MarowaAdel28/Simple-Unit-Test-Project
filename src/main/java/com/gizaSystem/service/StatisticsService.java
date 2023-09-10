package com.gizaSystem.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StatisticsService {

    private final UserService userService;

    final int SUMMATION=50;

    public double usersCountPercent() {
        return userService.getUsersCount()*(100.0/SUMMATION);
    }

    public final String sayHello() {
        return "hello";
    }

    private int mulBy2(int num) {
        return 2*num;
    }
}
