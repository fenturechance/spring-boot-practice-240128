package com.example.demo;

public class TestClass1 implements TestInterface{
    private String testStringProp;
    public TestClass1() {

    }

    public TestClass1(String testStringProp) {
        this.testStringProp = testStringProp;
    }
    @Override public void call() {
        System.out.println("1 call " + this.testStringProp);
    }
}
