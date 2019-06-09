package costavictor.com.github.springresiliencycircuitbreaker

import org.springframework.stereotype.Service

@Service
class MovieService(private val moviesConnector: MoviesConnector) {
    fun getMovies(): List<Movie> {
        return moviesConnector.fetchMovies()
    }
}
