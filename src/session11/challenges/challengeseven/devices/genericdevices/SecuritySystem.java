package session11.challenges.challengeseven.devices.genericdevices;

import session11.challenges.challengeseven.devices.interfacesfordevices.AlertMode;

public abstract class SecuritySystem extends GenericDevice implements AlertMode {

    protected SecuritySystem(String deviceName, double energyConsumption) {
        super(deviceName, energyConsumption);
    }

    public abstract void setAlertMode();

}
