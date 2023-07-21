package com.book.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookService {

@ResponseBody
@GetMapping ("/books")

	public String getBook() {
	System.out.println("welcome to spring validation service class");
	return "bookservice";
}

}
