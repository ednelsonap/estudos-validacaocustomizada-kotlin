package carro

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller
class NovoCarroController {

    @Post("/api/carros")
    fun cadastrar(@Body @Valid carro: Carro): HttpResponse<Any> {
        return HttpResponse.ok(carro)
    }

}