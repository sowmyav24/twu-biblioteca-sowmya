package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sowmyavi on 02/06/15.
 */
public class BibliotecaAppTest {
    @Test
    public void testWelcomeMessage(){
        BibliotecaApp obj=new BibliotecaApp();
        Assert.assertEquals("Welcome to BibliotecaApp",obj.display_message() );
    }

}