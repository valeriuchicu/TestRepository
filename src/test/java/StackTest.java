package test.java;

import main.java.stack.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp(){
        stack = Stack.make(2);
    }

    @Test
    public void newlyCreatedStackShouldBeEmpty(){
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void afterOnePush_StackSizeShouldBeOn(){
        stack.push(10);

        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterOnePshAndOnePop_StackShouldBeEmpty(){
        stack.push(10);
        stack.pop();

        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void whenOneIsPushed_OneIsPopped(){
        stack.push(1);

        assertEquals(1, stack.pop());
    }

    @Test
    public void whenOneAndTwoArePushed_TwoAndOneArePopped(){
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void whenPushedPastCapacity_ItOverflows(){
        assertThrows(Stack.OverflowException.class, () -> {
                stack.push(1);
                stack.push(2);
                stack.push(3);
    });
    }

    // moment of the video is 0:20:20
}