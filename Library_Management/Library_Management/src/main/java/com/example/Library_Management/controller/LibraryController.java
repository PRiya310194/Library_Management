package com.example.Library_Management.controller;

import com.example.Library_Management.model.Library;
import com.example.Library_Management.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/library")
public class LibraryController {
    @Autowired
    LibraryService libraryService;

    @PostMapping("/add-library")
    public void addLibrary(@RequestBody Library library){
LibraryService.addLibrary(library);
    }
    @GetMapping("/find-library/id/{id}")
    public Library findLibraryById(@PathVariable int id){
return LibraryService.findById(id);
    }
    @GetMapping("/find-all")
    public List<Library> findAllLibrary(){
return LibraryService.findAll();

    }
    @PutMapping
    public void updateLibrary(){

    }
    @DeleteMapping
    public void deleteLibrary(){

    }
}
