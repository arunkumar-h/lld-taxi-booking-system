package com.lld.taxi.booking.strategies;

import com.lld.taxi.booking.model.Cab;
import com.lld.taxi.booking.model.Location;
import com.lld.taxi.booking.model.Rider;

import java.util.List;

public interface CabMatchingStrategy {

    Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);

}
