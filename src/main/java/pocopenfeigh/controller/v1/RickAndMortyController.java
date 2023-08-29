package pocopenfeigh.controller.v1;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pocopenfeigh.service.CharacterService;
import pocopenfeigh.service.LocationService;
import pocopenfeigh.webclient.dto.CharacterDTO;
import pocopenfeigh.webclient.dto.LocationData;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("v1/rickAndMorty")
public class RickAndMortyController {

    private CharacterService service;
    private LocationService locationService;

    @GetMapping
    public ResponseEntity<LocationData> getAllInfosRickAndMorty(@RequestParam Map<String, String> params) {
        var response = service.getCharacter();

        var startTime = System.currentTimeMillis();
        var responseLocation = locationService.getAllLocation();
        var endTime = System.currentTimeMillis();

        final float secFinal = (endTime - startTime) / 1000F;
        System.out.println("Total: " + secFinal);
        return ResponseEntity.of(java.util.Optional.ofNullable(responseLocation));
    }
}
