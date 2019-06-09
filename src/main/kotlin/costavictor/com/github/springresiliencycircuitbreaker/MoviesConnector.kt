package costavictor.com.github.springresiliencycircuitbreaker

import io.github.resilience4j.bulkhead.annotation.Bulkhead
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import io.github.resilience4j.ratelimiter.annotation.RateLimiter
import io.github.resilience4j.retry.annotation.Retry
import org.apache.juli.logging.LogFactory
import org.springframework.stereotype.Component
import java.lang.Exception

const val BACKEND = "moviesExternalService"

@CircuitBreaker(name = BACKEND, fallbackMethod = "moviesFallback")
@RateLimiter(name = BACKEND)
@Bulkhead(name = BACKEND)
@Retry(name = BACKEND, fallbackMethod = "moviesFallback")
@Component
class MoviesConnector {

    private val logger = LogFactory.getLog(javaClass)

    fun fetchMovies(): List<Movie> {
        return listOf(Movie(1, "Movie 1", 3.0))
    }

    fun moviesFallback(ex: Exception): List<Movie> {
        logger.error(ex)
        return listOf()
    }
}
