package cholog.controller;

import cholog.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {

    @GetMapping("/products")
    public ResponseEntity<Void> searchProduct(@RequestParam String keyword) {
        if (true) {
            throw new IllegalArgumentException("Invalid keyword: " + keyword);
        }

        return ResponseEntity.ok().build();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleIllegalArgumentException(IllegalArgumentException exception) {
        Map<String, String> body = new HashMap<>();
        body.put("message", exception.getMessage());
        return ResponseEntity.badRequest().body(body);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Void> getProduct(@PathVariable Long id) {
        if (true) {
            throw new NotFoundException("Product not found: id=" + id);
        }

        return ResponseEntity.ok().build();
    }
}
