package pocopenfeigh.webclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CharacterDTO {

    private InfoDTO info;
    private Set<ResultDTO> results;
}
