package com.healthe.healtheworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**



Simple REST call that says from where its invoked from
*/
@RestController
public class HealtheWorldController {


 @GetMapping("/whereami")
 public String whereami() {


 return String.format("Hello from %s", System.getenv().getOrDefault("HOSTNAME", "localhost"));
 }
}