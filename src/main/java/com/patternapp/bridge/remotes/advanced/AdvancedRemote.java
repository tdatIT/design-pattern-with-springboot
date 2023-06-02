package com.patternapp.bridge.remotes.advanced;


import com.patternapp.bridge.devices.Device;
import com.patternapp.bridge.remotes.basic.BasicRemote;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
