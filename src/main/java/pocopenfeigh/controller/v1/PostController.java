package pocopenfeigh.controller.v1;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pocopenfeigh.webclient.PostClient;
import pocopenfeigh.webclient.dto.PostDTO;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("posts")
public class PostController {

    private PostClient postClient;

    @GetMapping
    public List<PostDTO> getAllPosts() {
        return postClient.getAllPost();
    }
}
