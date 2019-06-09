package costavictor.com.github.springresiliencycircuitbreaker

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/movies")
class MoviesController(private val movieService: MovieService) {
    @GetMapping
    fun getMovies(): List<Movie> {
        return movieService.getMovies()
    }
}