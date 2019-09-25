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
 @GetMapping("/all_env")
  public String all_env() {


 return String.format("%s", System.getenv().getOrDefault("APPLICATION_NAME", "letmein999")) + "\n" + 
 String.format("%s", System.getenv().getOrDefault("EnvironmentID", "letmein999")) + "\n" +
 String.format("%s", System.getenv().getOrDefault("DEBUG_LEVEL", "letmein999")) + "\n" +
 String.format("%s", System.getenv().getOrDefault("DB_HOST", "letmein999")) + "\n" +
 String.format("%s", System.getenv().getOrDefault("DB_USER", "letmein999")) + "\n" +
 String.format("%s", System.getenv().getOrDefault("DB_PASSWORD", "letmein999")) + "\n" +
 String.format("%s", System.getenv().getOrDefault("MAIL_HOST", "letmein999")) + "\n" +
 String.format("%s", System.getenv().getOrDefault("MAIL_USER", "letmein999")) + "\n" +
 String.format("%s", System.getenv().getOrDefault("PV_MOUNT_PATH", "letmein999")) + "\n" +
 String.format("%s", System.getenv().getOrDefault("SPLUNK_HOST", "letmein999")) + "\n" +
 String.format("%s", System.getenv().getOrDefault("SPLUNK_PORT", "letmein999")) + "\n" +
 String.format("%s", System.getenv().getOrDefault("TZ", "letmein999"));
 }
}