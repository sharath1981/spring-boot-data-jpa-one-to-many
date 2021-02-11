package com.datajpa.onetomany.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datajpa.onetomany.domain.Product;
import com.datajpa.onetomany.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("api/v1/products")
@RestController
public class ProductController {
	private final ProductRepository productRepository;
	
	@GetMapping
	public List<Product> list() {
		return productRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Product findById(@PathVariable Long id) {
		return productRepository.findById(id).orElseThrow();
	}
	
	@PostMapping
	public Product save(@RequestBody Product product) {
		return productRepository.save(product);
	}
}
