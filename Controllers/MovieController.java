public class MovieController {
  // Injected Service
  final IMovieService _movieService;



  public List<MovieDto> getMovies() {
    List<MovieDto> movies = _movieService.GetMovies();
    return movies;
  }


  public MovieDto getMovie(string Id) {
    MovieDto movie = _movieService.GetMovieById(Id);
    return movie;
  }
}
















}
