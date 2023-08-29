package pocopenfeigh.webclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pocopenfeigh.webclient.dto.CharacterDTO;

@FeignClient(name = "character", url = "https://rickandmortyapi.com/api")
public interface CharacterClient {

    @GetMapping(value = "/character")
    CharacterDTO getAllCharacter();
}
