package main.java.stack;

import java.util.Optional;

public class Stack {
    private int size;
    private int[] elements;

    public Optional<String> getName() {
        return Optional.of(name);
    }

    private String name;

    private Stack(int capacity){
        this.elements = new int[capacity];
    }

    public static Stack make(int capacity){
        return new Stack(capacity);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
       return size;
    }

    public void push(int element) {
        this.elements[size++] = element;
    }

    public int pop() {
        return elements[--size];
    }

    public static class OverflowException extends RuntimeException {
    }
}


