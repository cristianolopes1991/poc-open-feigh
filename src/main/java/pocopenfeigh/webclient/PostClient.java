package pocopenfeigh.webclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pocopenfeigh.webclient.dto.PostDTO;

import java.util.List;

@FeignClient(name = "post", url = "https://jsonplaceholder.typicode.com")
public interface PostClient {

    @GetMapping(value = "/posts")
    List<PostDTO> getAllPost();
}
