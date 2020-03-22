package com.experiment.Mayank.EndPoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class RestEndPoint {

	@GetMapping("/hello")
    public String all() {

		System.out.println("Inside call");
        return "Hello From Application";
    }
}
