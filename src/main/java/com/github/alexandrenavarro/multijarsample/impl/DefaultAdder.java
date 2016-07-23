package com.github.alexandrenavarro.multijarsample.impl;

import com.github.alexandrenavarro.multijarsample.Adder;

/**
 * Created by anavarro on 23/07/16.
 */
public class DefaultAdder implements Adder {

    @Override
    public double add(double a, double b) {
        return a + b;
    }
}
