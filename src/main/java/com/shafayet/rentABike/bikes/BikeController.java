package com.shafayet.rentABike.bikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {

    @Autowired
    private BikeRepository bikeRepository;

    @PostMapping
    public ResponseEntity<String> addBike(@RequestBody Bike bike) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserRole = authentication.getAuthorities().iterator().next().getAuthority();


        if ("ADMIN".equals(currentUserRole)) {
            bike.setAppUserRole(currentUserRole);
            System.out.println(currentUserRole);
            bikeRepository.save(bike);
            return ResponseEntity.status(HttpStatus.CREATED).body("Bike added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(currentUserRole + "Only Admin users can add bikes");
        }
    }

    @GetMapping
    public ResponseEntity<List<Bike>> getAllBikes() {
        List<Bike> bikes = bikeRepository.findAll();
        return ResponseEntity.ok(bikes);
    }
}
