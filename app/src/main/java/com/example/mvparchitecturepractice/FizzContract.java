package com.example.mvparchitecturepractice;

public interface FizzContract {

    public interface PresenterContract{
        void showFizzOrBuzz(String fizzOrBuzz);
    }

    public interface ViewContract{
        void onInput(String input);
    }
}
