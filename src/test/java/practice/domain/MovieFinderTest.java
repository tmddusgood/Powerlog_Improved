package practice.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.MovieFactory;
import practice.domain.Movie;
import practice.domain.MovieFinder;

import java.util.List;


public class MovieFinderTest {
	final MovieFactory movieFactory = new MovieFactory();
	final MovieFinder movieFinder = movieFactory.movieFinder();

	@Test
	void NotEmpty_directedBy(){
		List<Movie> movies = movieFinder.directedBy("Michael Bay");
		Assertions.assertEquals(3, movies.size());
	}

	@Test
	void NotEMpty_ReleaseYearBy(){
		List<Movie> movies = movieFinder.releasedYearBy(2015);
		Assertions.assertEquals(225, movies.size());
	}
//	public static void main(String[] args) {


//		List<Movie> result = movieFinder.directedBy("Michael Bay");
//		assertEquals(3, result.size());
//
//        result = movieFinder.releasedYearBy(2015);
//        assertEquals(225, result.size());
//	}
//
//	static void assertEquals(long expected, long actual) {
//		if (expected != actual) {
//			throw new RuntimeException(String.format("actual(%d) is different from the expected(%d)", actual, expected));
//		}
//	}
	
}
