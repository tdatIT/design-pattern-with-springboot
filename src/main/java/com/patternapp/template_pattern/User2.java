package com.patternapp.template_pattern;

public class User2 extends UserAction{
    @Override
    protected void watchProduct() {

    }

    @Override
    protected void reviewProduct() {
        System.out.println("User2 review bad product");
    }
}
