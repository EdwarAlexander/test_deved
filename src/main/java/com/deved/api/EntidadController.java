package com.deved.api;

import com.deved.util.AccessProduct;
import com.deved.util.Notify;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "entidad")
public class EntidadController {

    @GetMapping(path = "{dato}")
    @Notify
    @AccessProduct
    public ResponseEntity<Map<String,String>> get(@PathVariable String dato, @RequestParam String mensaje){
        return ResponseEntity.ok(Collections.singletonMap(dato,mensaje));
    }
}
