package com.fatihtoker.afspraak.controller;

import com.fatihtoker.afspraak.model.MeetModel;
import com.fatihtoker.afspraak.service.MeetService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
@RequestMapping("/meet")
public class MeetController {

    @Autowired
    private MeetService meetService;


    @GetMapping("/")
    public List<MeetModel> index(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        java.util.Date date = new Date();
        String s = dateFormat.format(date);
        meetService.saveMeet(new MeetModel(s,"123","123"));
        return meetService.showAll();
    }

    @PostMapping("/save")
    public Optional<MeetModel> saveMeet(@RequestBody MeetModel meetModel){
        meetService.saveMeet(meetModel);
        return meetService.findById(meetModel.getId());
    }

    @PostMapping("/{id}")
    public Optional<MeetModel> findById(@PathVariable("id") long id){
        return meetService.findById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") long id){
        return meetService.deleteById(id);
    }
}
