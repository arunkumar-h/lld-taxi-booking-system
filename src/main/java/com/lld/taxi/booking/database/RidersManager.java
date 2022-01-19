package com.lld.taxi.booking.database;

import com.lld.taxi.booking.exception.RiderAlreadyExistsException;
import com.lld.taxi.booking.exception.RiderNotFoundException;
import com.lld.taxi.booking.model.Rider;
import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;

/**
 * In memory database for storing jobs.
 */
public class RidersManager {
    Map<String, Rider> riders = new HashMap<>();

    public void createRider(@NonNull final Rider newRider) {
        if (riders.containsKey(newRider.getId())) {
            throw new RiderAlreadyExistsException();
        }

        riders.put(newRider.getId(), newRider);
    }

    public Rider getRider(@NonNull final String riderId) {
        if (!riders.containsKey(riderId)) {
            throw new RiderNotFoundException();
        }
        return riders.get(riderId);
    }
}
