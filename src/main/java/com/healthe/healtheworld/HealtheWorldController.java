package com.healthe.healtheworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**



Simple REST call that says from where its invoked from
*/
@RestController
public class HealtheWorldController {


 @GetMapping("/pod")
 public String pod() {


 return String.format("%s", System.getenv().getOrDefault("HOSTNAME", "localhost"));
 }
 
 @GetMapping("/db_user")
 public String db_user() {


 return String.format("%s", System.getenv().getOrDefault("DB_USER", "localhost"));
 }
 
 @GetMapping("/db_password")
  public String db_user() {


 return String.format("%s", System.getenv().getOrDefault("DB_PASSWORD", "localhost"));
 }
}