package pocopenfeigh.webclient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "character", url = "https://rickandmortyapi.com/api/character")
public interface CharacterClient {
}
