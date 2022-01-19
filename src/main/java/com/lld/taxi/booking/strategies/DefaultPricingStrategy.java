package com.lld.taxi.booking.strategies;

import com.lld.taxi.booking.model.Location;

public class DefaultPricingStrategy implements PricingStrategy {

    public static final Double PER_KM_RATE = 10.0;

    @Override
    public Double findPrice(Location fromPoint, Location toPoint) {
        return fromPoint.distance(toPoint) * PER_KM_RATE;
    }
}
