package blog.controller;

import blog.model.Post;
import blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bbn on 31/03/17.
 */
@RestController
public class PostController {
  @Autowired
  PostRepository postRepository;

  @RequestMapping(value="/posts", method = RequestMethod.GET)
  public List<Post> getAll(){
    return postRepository.findAll();
  }

  @RequestMapping(value="/post", method = RequestMethod.GET)
  public Post get(@RequestParam(value = "id") Long id){
    return postRepository.findById(id);
  }

}
