package com.design_patterns.structural.adapter;

public class Adapter implements IAircraft {

    HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon hotAirBalloon) {
        this.hotAirBalloon = hotAirBalloon;
    }

    @Override
    public void fly() {
        String fuelUsed = hotAirBalloon.inflateWithGas();
        hotAirBalloon.fly(fuelUsed);
    }

}
