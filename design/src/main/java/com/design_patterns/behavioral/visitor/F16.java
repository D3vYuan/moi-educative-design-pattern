package com.design_patterns.behavioral.visitor;

public class F16 implements IAircraft {
    @Override
    public void accept(IAircraftVisitor visitor) {
        visitor.visitF16(this);
    }
}
