package pocopenfeigh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pocopenfeigh.webclient.LocationClient;
import pocopenfeigh.webclient.dto.LocationData;

@Service
public class LocationService {
    @Autowired
    private LocationClient locationClient;

    public LocationData getAllLocation() {
        return locationClient.getAllLocation();
    }
}
