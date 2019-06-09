package costavictor.com.github.springresiliencycircuitbreaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringResiliencyCircuitBreakerApplication

fun main(args: Array<String>) {
	runApplication<SpringResiliencyCircuitBreakerApplication>(*args)
}
