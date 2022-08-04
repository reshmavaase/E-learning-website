package com.example.controlller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.model.Devlopment;
import com.example.service.DevelopmentService;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/Development")
public class DevlopmentController {
    private final DevelopmentService Service;

    public DevlopmentController(DevelopmentService Service) {
        this.Service = Service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Devlopment>> getAllCourses () {
        List<Devlopment> employees = Service.findAllcourses();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Devlopment> getCourseById (@PathVariable("id") Long id) throws Exception {
    	Devlopment dev = Service.findCourseById(id);
        return new ResponseEntity<>(dev, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Devlopment> addCourse(@RequestBody Devlopment dev) {
    	Devlopment newEmployee = Service.addcourse(dev);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Devlopment> updateCourse(@RequestBody Devlopment dev) {
    	Devlopment updateEmployee = Service.updatecourse(dev);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable("id") Long id) {
        Service.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}