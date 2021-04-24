package practice.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JaxbMovieReader {

    @Test
    void NotEmpty_LoadMovies() {
        JaxbMovieReader movieReader = new JaxbMovieReader();

        List<Movie> movies = movieReader.NotEmpty_LoadMovies();
        Assertions.assertEquals(1375, movies.size());

    }
}
