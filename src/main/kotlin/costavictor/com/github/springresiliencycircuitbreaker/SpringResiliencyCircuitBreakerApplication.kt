package costavictor.com.github.springresiliencycircuitbreaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class SpringResiliencyCircuitBreakerApplication

fun main(args: Array<String>) {
	runApplication<SpringResiliencyCircuitBreakerApplication>(*args)
}
