public interface IMovieService {
  List<MovieDto> GetMovies();
  MovieDto GetByName(string name); // SQL + (marker interface)API  Mongo + (marker interface)API
}
