package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class BibliotecaAppTest {

    @Test
    public void testWelcomeMessage() {
        BibliotecaApp user = new BibliotecaApp();

        Assert.assertEquals("Welcome to BibliotecaApp", user.greetUser());
    }

}