package com.oneio.FizzBuzz.service;

import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {
    @Override
    public String getFizzBuzzResult(int number) {
        return IntStream.rangeClosed(1, number)
                .mapToObj(i -> i % 5 == 0 ? (i % 3 == 0 ? "FizzBuzz " : "Buzz ") : (i % 3 == 0 ? "Fizz " : i + " "))
                .collect(Collectors.joining(","));
    }
}
