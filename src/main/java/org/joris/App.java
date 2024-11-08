package org.joris;

public class App
{
    public static void main( String[] args )
    {
        WordCounter wordCounter = new WordCounter("Hello world, hello there");
        wordCounter.wordCounter();
    }
}
