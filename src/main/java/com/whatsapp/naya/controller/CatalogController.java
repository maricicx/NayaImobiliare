package com.whatsapp.naya.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class CatalogController
{
   private final Logger logger = Logger.getLogger(CatalogController.class.getName());

   private static final String VERIFY_TOKEN = "QW3HXqF1hkot1e6hJDI";

   @GetMapping("/webhook")
   public ResponseEntity<String> verifyWebhook( @RequestParam("hub.mode") String mode,
                                                @RequestParam("hub.challenge") String challenge,
                                                @RequestParam("hub.verify_token") String token) {
      if (mode != null && token != null && token.equals(VERIFY_TOKEN)) {
         return ResponseEntity.ok(challenge);
      } else {
         return ResponseEntity.status(403).body("Verification token mismatch");
      }
   }

   @PostMapping("/webhook")
   public ResponseEntity<String> getCatalog(@RequestBody String payload) {
      // Process the webhook payload
      System.out.println(payload);
      logger.info(payload);
      return ResponseEntity.ok("Received");
   }
}
