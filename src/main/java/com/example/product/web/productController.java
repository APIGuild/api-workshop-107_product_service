package com.example.product.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created on 10/24/17.
 */
@RestController
@RequestMapping("/product")
public class productController {

    @RequestMapping(value = "/{productId}", method = GET)
    public String getProduct(@PathVariable("productId") String productId) {
        return "This is a Simple product -- " + productId;
    }

}
