package com.design_patterns.structural.bridge;

public class Corolla_L extends AbstractCorolla {
    public Corolla_L(AbstractCorollaImpl corollaImpl) {
        this.corollaImpl = corollaImpl;
    }

    @Override
    void listSafetyEquipment() {
        corollaImpl.listSafetyEquipment();

    }

    @Override
    boolean isCarRightHanded() {
        return corollaImpl.isCarRightHanded();
    }
}
