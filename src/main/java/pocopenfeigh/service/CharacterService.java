package pocopenfeigh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pocopenfeigh.webclient.CharacterClient;
import pocopenfeigh.webclient.dto.CharacterDTO;

import java.util.concurrent.CompletableFuture;

@Service
public class CharacterService {

    @Autowired
    private CharacterClient characterClient;

    public CompletableFuture<CharacterDTO> getCharacter() {

        return CompletableFuture.completedFuture(characterClient.getAllCharacter());
    }


}
