package practice.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("JaxbReader 테스트")
public class JaxbMovieReaderTest {

    @DisplayName("JaxbReader 기댓값 테스트")
    @Test
    void NotEmpty_LoadMovies() {
        JaxbMovieReader movieReader = new JaxbMovieReader();

        List<Movie> movies = movieReader.loadMovies();
        Assertions.assertEquals(1375, movies.size());

    }
}
