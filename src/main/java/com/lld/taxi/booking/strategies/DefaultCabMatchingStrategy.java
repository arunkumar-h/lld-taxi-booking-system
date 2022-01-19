package com.lld.taxi.booking.strategies;

import com.lld.taxi.booking.model.Cab;
import com.lld.taxi.booking.model.Location;
import com.lld.taxi.booking.model.Rider;
import lombok.NonNull;

import java.util.List;

public class DefaultCabMatchingStrategy implements CabMatchingStrategy {

    @Override
    public Cab matchCabToRider(
            @NonNull final Rider rider,
            @NonNull final List<Cab> candidateCabs,
            @NonNull final Location fromPoint,
            @NonNull final Location toPoint) {
        if (candidateCabs.isEmpty()) {
            return null;
        }
        return candidateCabs.get(0);
    }
}
