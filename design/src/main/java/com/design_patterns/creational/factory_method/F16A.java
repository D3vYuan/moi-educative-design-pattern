package com.design_patterns.creational.factory_method;

class F16AEngine implements IEngine {

}

public class F16A extends F16 {
    @Override
    public F16 makeF16() {
        super.makeF16();
        engine = new F16AEngine();
        return this;
    }
}
