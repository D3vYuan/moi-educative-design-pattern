package com.design_patterns.creational.factory_method;

class F16BEngine implements IEngine {

}

public class F16B extends F16 {
    @Override
    public F16 makeF16() {
        super.makeF16();
        engine = new F16BEngine();
        return this;
    }
}
