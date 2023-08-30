package pocopenfeigh.controller.v1;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pocopenfeigh.service.CharacterService;
import pocopenfeigh.service.LocationService;
import pocopenfeigh.webclient.dto.CharacterDTO;
import pocopenfeigh.webclient.dto.LocationData;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

@AllArgsConstructor
@RestController
@RequestMapping("v1/rickAndMorty")
public class RickAndMortyController {

    private CharacterService service;
    private LocationService locationService;

    @GetMapping
    public ResponseEntity<Object> getAllInfosRickAndMorty(@RequestParam Map<String, String> params) {

        var startTime1 = System.currentTimeMillis();
        var response = service.getCharacter();
        var respJoin = response.join();
        var endTime1 = System.currentTimeMillis();

        var startTime = System.currentTimeMillis();
        var responseLocation = locationService.getAllLocation();
        var resspJoin = responseLocation.join();
        var endTime = System.currentTimeMillis();

        final float secFinal = (endTime - startTime) / 1000F;
        final float secFinal1 = (endTime1 - startTime1) / 1000F;
        System.out.println("Total: " + secFinal);
        System.out.println("Total1: " + secFinal1);
        return ResponseEntity.of(java.util.Optional.ofNullable(respJoin));
    }
}
