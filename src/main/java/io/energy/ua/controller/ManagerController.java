package io.energy.ua.controller;

import io.energy.ua.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/manager")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8081")
public class ManagerController {
    private final ManagerService managerService;
    @GetMapping("/data")
    public ResponseEntity<?> getData(@RequestParam(value = "year", required = false) List<Integer> years) {
        return ResponseEntity.ok(managerService.getData(years));
    }

    @GetMapping("/measurement")
    public ResponseEntity<?> getMeasurement() {
        return ResponseEntity.ok(managerService.getMeasurement());
    }
}
