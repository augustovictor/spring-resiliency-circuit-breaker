package costavictor.com.github.springresiliencycircuitbreaker

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient(
        name = "imdbApi",
        url = "http://localhost:3000/imdb/v1"
//        configuration = ""
)
interface ImdbClient {
    @GetMapping("/movies")
    fun fetchMovies(): List<Movie>
}