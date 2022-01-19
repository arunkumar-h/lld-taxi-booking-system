package com.lld.taxi.booking.strategies;

import com.lld.taxi.booking.model.Location;

public interface PricingStrategy {
    Double findPrice(Location fromPoint, Location toPoint);
}
