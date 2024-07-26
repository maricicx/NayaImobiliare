package com.whatsapp.naya.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController
{
   @GetMapping("/webhook")
   public ResponseEntity<String> getCatalog(@RequestBody String payload) {
      // Process the webhook payload
      System.out.println(payload);
      return ResponseEntity.ok("Received");
   }
}
