package com.whatsapp.naya.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class CatalogController
{
   private final Logger logger = Logger.getLogger(CatalogController.class.getName());

   @GetMapping("/webhook")
   public ResponseEntity<String> getCatalog(@RequestBody String payload) {
      // Process the webhook payload
      System.out.println(payload);
      logger.info(payload);
      return ResponseEntity.ok("Received");
   }
}
