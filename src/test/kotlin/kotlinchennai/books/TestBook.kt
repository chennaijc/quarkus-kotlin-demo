package kotlinchennai.books

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.Test


class TestBook {

    fun initiallyMoviesIsEmpty() {
        given()
            .`when`().get("/api/books")
            .then()
            .statusCode(equalTo(200))
    }


    fun shouldBeEmptyWhenInvalidMovieIdProvided() {
        given()
            .pathParam("id", 2)
            .`when`().get("/books/id/{id}")
            .then()
            .statusCode(200).body("id", equalTo(2)).body("title", equalTo("Ponnien Selvan 2"))

    }


    fun shouldAddAMovie() {
        val jsonStr = """{"id" : 3,"title" : "Sardar","released" : 2022}"""

        given().contentType(ContentType.JSON).
        and().body(jsonStr).
        `when`().post("/api/books").
        then().body("id", equalTo(3))
    }


}