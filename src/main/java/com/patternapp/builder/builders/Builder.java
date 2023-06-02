package com.patternapp.builder.builders;


import com.patternapp.builder.cars.Type;
import com.patternapp.builder.components.Engine;
import com.patternapp.builder.components.GPSNavigator;
import com.patternapp.builder.components.Transmission;
import com.patternapp.builder.components.TripComputer;

public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
