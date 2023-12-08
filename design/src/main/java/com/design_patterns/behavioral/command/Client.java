package com.design_patterns.behavioral.command;

/**
 * Defintion
 * The pattern is defined as representing an action or a request as an object
 * that can then be passed to other objects as parameters, allowing
 * parameterization of clients with requests or actions. The requests can be
 * queued for later execution or logged. Logging requests enables undo
 * operations.
 */
public class Client {
    public static void main(String[] args) {
        LandingGear landingGear = new LandingGear();
        LandingGearDownCommand landingGearDownCommand = new LandingGearDownCommand(landingGear);
        LandingGearUpCommand landingGearUpCommand = new LandingGearUpCommand(landingGear);

        // Create the instrument panel
        InstrumentPanel instrumentPanel = new InstrumentPanel();

        // Assign the commands
        instrumentPanel.setCommand(0, landingGearUpCommand);
        instrumentPanel.setCommand(1, landingGearDownCommand);

        // Lower the landing gear
        instrumentPanel.lowerLandingGear();

        // Retract the landing gear
        instrumentPanel.retractLandingGear();
    }
}
