package com.design_patterns.structural.bridge;

public abstract class AbstractCorolla {

    protected AbstractCorollaImpl corollaImpl;

    abstract void listSafetyEquipment();

    abstract boolean isCarRightHanded();

    public void setCorollaImpl(AbstractCorollaImpl corollaImpl) {
        this.corollaImpl = corollaImpl;
    }
}
