package com.simplilearn.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

	@GetMapping("/welcome")
	public String welcome() {
		return "<h3>Welcome to Spring Boot</h3>";
	}
	@GetMapping("/products")
	public Response getProducts() {
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product("iphone",70000));
		productList.add(new Product("MacBook",96000));
		productList.add(new Product("Watch",70000));
		
		Response  response= new Response(101, "Product fetched Successfully", productList);
		return response;
	}
}
