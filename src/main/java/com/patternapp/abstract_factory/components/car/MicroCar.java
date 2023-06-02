package com.patternapp.abstract_factory.components.car;


import com.patternapp.abstract_factory.components.Vehicle;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MicroCar implements Vehicle {

    @Override
    public String createVehicle() {
        // TODO Auto-generated method stub
        String timeStamp = new SimpleDateFormat("dd:MM:yyyy_HH:mm:ss")
                .format(Calendar.getInstance().getTime());
        return String.format("'Micro Car' Was Created at: %s", timeStamp);
    }
}
