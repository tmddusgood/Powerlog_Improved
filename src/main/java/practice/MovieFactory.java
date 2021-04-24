package practice;

import practice.domain.CsvMovieReader;
import practice.domain.MovieFinder;

public class MovieFactory {

    public MovieFinder movieFinder(){
        return new MovieFinder(new CsvMovieReader());
    }
}
