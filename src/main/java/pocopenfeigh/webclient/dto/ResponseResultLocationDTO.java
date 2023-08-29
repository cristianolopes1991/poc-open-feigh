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
public class ResponseResultLocationDTO {

    private Integer id;
    private String name;
    private String dimension;
    private Set<String> residents;
    private String url;
    private String created;
}
