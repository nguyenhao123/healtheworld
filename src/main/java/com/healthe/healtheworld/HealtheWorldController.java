package com.healthe.healtheworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**



Simple REST call that says from where its invoked from
*/
@RestController
public class HealtheWorldController {

String newline = System.getProperty("line.separator");

 @GetMapping("/pod")
 public String pod() {
 
 return "HOSTNAME: " + String.format("%s", System.getenv().getOrDefault("HOSTNAME", "localhost"));
 }

 @GetMapping("/all_env")
 public String all_env() {
 
 return "HOSTNAME: " + String.format("%s", System.getenv().getOrDefault("HOSTNAME", "localhost")) + "<br>" +
 "APPLICATION_NAME: " + String.format("%s", System.getenv().getOrDefault("APPLICATION_NAME", "localhost")) + "<br>" +
 "EnvironmentID: " + String.format("%s", System.getenv().getOrDefault("EnvironmentID", "localhost")) + "<br>" +
 "DEBUG_LEVEL: " + String.format("%s", System.getenv().getOrDefault("DEBUG_LEVEL", "localhost")) + "<br>" +
 "DB_HOST: " + String.format("%s", System.getenv().getOrDefault("DB_HOST", "localhost")) + "<br>" +
 "DB_USER: " + String.format("%s", System.getenv().getOrDefault("DB_USER", "localhost")) + "<br>" +
 "DB_PASSWORD: " + String.format("%s", System.getenv().getOrDefault("DB_PASSWORD", "localhost")) + "<br>" +
 "MAIL_HOST: " + String.format("%s", System.getenv().getOrDefault("MAIL_HOST", "localhost")) + "<br>" +
 "MAIL_USER: " + String.format("%s", System.getenv().getOrDefault("MAIL_USER", "localhost")) + "<br>" +
 "PERSISTENT_DATA: " + String.format("%s", System.getenv().getOrDefault("PERSISTENT_DATA", "localhost")) + "<br>" +
 "SPLUNK_HOST: " + String.format("%s", System.getenv().getOrDefault("SPLUNK_HOST", "localhost")) + "<br>" +
 "SPLUNK_PORT: " + String.format("%s", System.getenv().getOrDefault("SPLUNK_PORT", "localhost")) + "<br>" +
 "TZ: " + String.format("%s", System.getenv().getOrDefault("TZ", "localhost"));
 }
 
 @GetMapping("/db_host")
  public String db_host() {


 return String.format("%s", System.getenv().getOrDefault("DB_HOST", "localhost"));
 }
 
 @GetMapping("/db_user")
 public String db_user() {


 return String.format("%s", System.getenv().getOrDefault("DB_USER", "developer"));
 }
 
 @GetMapping("/db_password")
  public String db_password() {


 return String.format("%s", System.getenv().getOrDefault("DB_PASSWORD", "letmein999"));
 }
 
 @GetMapping("/application_name")
  public String application_name() {


 return "APPLICATION_NAME: " + String.format("%s", System.getenv().getOrDefault("APPLICATION_NAME", "letmein999"));
 }

 @GetMapping("/environment_id")
  public String environment_id() {


 return String.format("%s", System.getenv().getOrDefault("EnvironmentID", "letmein999"));
 }
}