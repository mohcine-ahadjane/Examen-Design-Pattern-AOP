package org.mohcine.elements;

public abstract class EntityDecorator{
    Entity entity;

    public EntityDecorator(Entity entity) {
        this.entity = entity;
    }
}
