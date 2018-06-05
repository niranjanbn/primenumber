package com.niranjan.primenumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        App app = new App();
        
        int[] numbers = new int[] {2,5,7,9,13,91,92,93,94,95,96,97,99,100};
        
        //System.out.print("Prime numbers are::");
        System.out.println("Prime numbers are::"+ Arrays.stream(numbers).boxed().filter(app::isPrimeNumber).collect(Collectors.toList()));
        
        List<Integer> numberList =Arrays.stream(numbers).boxed().collect(Collectors.toList());
        System.out.println("Prime numbers are::"+ numberList.stream().filter(app::isPrimeNumber).collect(Collectors.toList()));
        
    }
    
    public boolean isPrimeNumber(int num) {
    	return IntStream.rangeClosed(2, num/2).noneMatch(i->num%i==0);
    }
}
