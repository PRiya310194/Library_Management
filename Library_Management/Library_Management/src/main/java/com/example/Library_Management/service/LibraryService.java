package com.example.Library_Management.service;

import com.example.Library_Management.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public  class LibraryService {
    static List<Library> libraries=new ArrayList<>();
    private static int count=0;
    static{
        libraries.add(new Library(++count,"library1","Ranchi",888888,"Chair"));
        libraries.add(new Library(++count,"library2","Patna",777777,"wheel_Chair"));
        libraries.add(new Library(++count,"library3","Tata",8877778,"Chair"));
        libraries.add(new Library(++count,"library4","Delhi",855558,"Chair"));
        libraries.add(new Library(++count,"library5","kolkata",8444448,"Chair"));
    }
public static List<Library>findAll(){
        return libraries;
    }
    public static Library findById(int id){
        Predicate<? super Library> predicate= library -> library.getId()==id;   // business logic
        Library library=libraries.stream().filter(predicate).findFirst().get();
        return  library;
    }
    public static void addLibrary(Library library){
        libraries.add(library);
    }


}
