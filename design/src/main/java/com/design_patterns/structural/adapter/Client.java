package com.design_patterns.structural.adapter;

/**
 * Definition
 * The Adapter pattern allows two incompatible classes to interoperate that
 * otherwise can't work with eachother
 */
public class Client {
    public static void main(String[] args) {
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Adapter hotAirBalloonAdapter = new Adapter(hotAirBalloon);

        hotAirBalloonAdapter.fly();
    }
}
