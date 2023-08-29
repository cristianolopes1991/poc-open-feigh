package pocopenfeigh.webclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pocopenfeigh.webclient.dto.LocationData;

@FeignClient(name = "location", url = "https://rickandmortyapi.com/api")
public interface LocationClient {

    @GetMapping(value = "/location")
    LocationData getAllLocation();
}
