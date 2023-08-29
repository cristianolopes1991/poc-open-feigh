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
public class ResultDTO {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;

    private OriginDTO origin;

    private LocationDTO location;
    private String image;

    private Set<String> episode;
    private String url;
    private String created;
}
