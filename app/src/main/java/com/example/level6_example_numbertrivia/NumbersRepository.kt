package com.example.level6_example_numbertrivia

class NumbersRepository {
    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()
}
