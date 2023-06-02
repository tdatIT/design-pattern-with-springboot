package com.patternapp.template_pattern;

public abstract class UserAction {
    protected void login(){
        System.out.println("User login");
    }
    protected void watchProduct(){
        System.out.println("User watch product");
    }
    protected void buyProduct(){
        System.out.println("User buy product");
    }
    protected void reviewProduct(){
    }
    public final void listUserAction(){
        login();
        watchProduct();
        buyProduct();
        reviewProduct();
    }
}
