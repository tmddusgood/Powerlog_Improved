package practice;

import java.util.List;


public class MovieSearchApplicationTest {

	public static void main(String[] args) {
		MovieSearchApplication application = new MovieSearchApplication();
		
		List<Movie> result = application.directedBy("Michael Bay");
		assertEquals(3, result.size());

        result = application.releasedYearBy(2015);
        assertEquals(225, result.size());
	}
	
	static void assertEquals(long expected, long actual) {
		if (expected != actual) {
			throw new RuntimeException(String.format("actual(%d) is different from the expected(%d)", actual, expected));			
		}
	}
	
}
