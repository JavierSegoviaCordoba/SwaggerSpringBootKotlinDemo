package com.javiersc.swaggerdemo.controller

import com.javiersc.swaggerdemo.model.Company
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyController {

    @GetMapping("/companies")
    fun getCompanies() = companies

}

val companies = listOf(
    Company(1, "Google", "https://cdn4.iconfinder.com/data/icons/new-google-logo-2015/400/new-google-favicon-512.png"),
    Company(2, "Microsoft", "https://cdn1.iconfinder.com/data/icons/flat-and-simple-part-1/128/microsoft-512.png")
)