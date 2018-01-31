package com.example.demo.infrastructure.healthcheck;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin/healthcheck", produces = "text/plain")
public class HealthCheckController {

  /**
   * @see <a href= "https://confluence.rewe-digital.com/display/ARC/Health%2C+Healthcheck+and+Alive+Resources">
   *     Health, Healthcheck and Alive Resources</a>
   */
  @RequestMapping(method = GET)
  public ResponseEntity<Void> healthCheck() {

    return ok().build();
  }
}
