package com.fatihtoker.afspraak.service;

import com.fatihtoker.afspraak.model.MeetModel;
import com.fatihtoker.afspraak.repository.MeetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeetService{

    @Autowired
    MeetRepository meetRepository;

    public List<MeetModel> showAll(){
        return meetRepository.findAll();
    }

    public MeetModel saveMeet(MeetModel meet){
       return meetRepository.save(meet);
    }

    public Optional<MeetModel> findById(long id){
        return meetRepository.findById(id);
    }

    public String deleteById(long id){
        meetRepository.deleteById(id);
        return "id : "+ id + " Succesfull Delete";
    }

}
