package org.mohcine.elements;

import java.util.List;

public class Interface extends Entity{
    List<Method> methods;

    public Interface(List<Method> methods) {
        this.methods = methods;
    }
}
