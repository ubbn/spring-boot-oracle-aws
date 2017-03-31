package blog.repository;

import blog.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by bbn on 31/03/17.
 */
public interface PostRepository extends CrudRepository<Post, Long> {
  Post findById(@Param("id") Long id);

  List<Post> findAll();

  @RestResource(path = "getPostsByTitle")
  List<Post> findByTitle(@Param("title") String title);

  // custom query example and return a stream
//  @Query("select p from Post where title = :title")
//  Stream<Post> findByTitleReturnStream(@Param("title") String title);

}
