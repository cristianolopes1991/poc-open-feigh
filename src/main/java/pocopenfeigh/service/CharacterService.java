package pocopenfeigh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pocopenfeigh.webclient.CharacterClient;
import pocopenfeigh.webclient.dto.CharacterDTO;

@Service
public class CharacterService {

    @Autowired
    private CharacterClient characterClient;

    public CharacterDTO getCharacter() {
        return characterClient.getAllCharacter();
    }


}
