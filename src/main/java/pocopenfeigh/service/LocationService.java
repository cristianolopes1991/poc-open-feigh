package pocopenfeigh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import pocopenfeigh.webclient.LocationClient;
import pocopenfeigh.webclient.dto.LocationData;

import java.util.concurrent.CompletableFuture;

@Service
public class LocationService {
    @Autowired
    private LocationClient locationClient;

    @Async
    public CompletableFuture<LocationData> getAllLocation() {
        return CompletableFuture.completedFuture(locationClient.getAllLocation());
    }
}
