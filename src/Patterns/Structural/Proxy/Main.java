package Patterns.Structural.Proxy;

import Patterns.Structural.Proxy.DoAPI.DoAPIProxy;

public class Main {
    public static void main(String[] args) {
        DoAPIProxy proxy = new DoAPIProxy();
        proxy.validateAndPerform("balle");
        proxy.validateAndPerform("");
    }
}
