package org.mohcine.elements;

import java.util.List;

public class Class extends EntityDecorator{
    List<Attribute> attributes;
    List<Method> abstractMethods;
    public Class(Entity entity) {
        super(entity);
    }
}
