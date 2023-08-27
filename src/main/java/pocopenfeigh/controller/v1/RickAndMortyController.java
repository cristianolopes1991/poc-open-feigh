package pocopenfeigh.controller.v1;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("v1/rickAndMorty")
public class RickAndMortyController {

    @GetMapping
    public ResponseEntity<?> getAllInfosRickAndMorty(@RequestParam Map<String, String> params) {


        return ResponseEntity.of(null);
    }
}
