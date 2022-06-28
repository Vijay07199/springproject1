public interface IDirectorService {
  List<DirectorDto> GetAllDirectors();

  bool ServerRunning();
}
