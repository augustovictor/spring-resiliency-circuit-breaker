package costavictor.com.github.springresiliencycircuitbreaker

import org.springframework.stereotype.Service

@Service
class MovieService {
    fun getMovies(): List<Movie> {
        return listOf(Movie(1, "Movie title", 3.0))
    }
}
