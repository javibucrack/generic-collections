package org.iesfm.stack;

import org.junit.Assert;
import org.junit.Test;

public class StackTests {

    @Test
    public void pushStack(){
        Stack<Integer>stack=new Stack<>();
        stack.push(2);
        stack.push(9);
        stack.push(-2);
        stack.push(40);

    }
}
