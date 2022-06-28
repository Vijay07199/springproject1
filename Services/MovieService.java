public class MovieService implements IMovieService {
  @AutoWired
  final IMovieRepository _movieRepository;

  List<MovieDto> GetMovies() {
    // Work on Model
     List<Movie> movies = _movieRepository.findAll(); 
    /*
     * [ { Id, Name, RunningTime },
     *   { Id, Name, RunningTime }
     * ]
     */
    
     List<MovieDto> response = new List();
     /*
      * [ Name, Name, Name ,.....]
      */

     for(Movie movie: movies) {
      MovieDto dto = new MovieDto(movie.getName());
      response.Add(dto);
     }

    // Return DTO
    return response;
  };

  // Hello World // Hello 
  public MovieDto GetByName(string name) {
     List<Movie> movies = _movieRepository.findAll(); 

     IMovieFilter movieFilter = new SearchByNameFilter();

     string correctedName = movieFilter.resolve(); 

     for(Movie movie: movies) {
      if(movie.getName() == correctedName) {
        MovieDto response = new MovieDto(name);
        return response;
      }
     }
     throw new MovieWithNameNotFoundException(name);
  }
}
