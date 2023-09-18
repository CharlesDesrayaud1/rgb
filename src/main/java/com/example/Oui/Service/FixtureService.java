package com.example.Oui.Service;

import com.example.Oui.DAO.Event.Fixture;
import com.example.Oui.Repository.FixtureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FixtureService {

    private FixtureRepository fixtureRepository;


    public List<Fixture> getAll(){
        return fixtureRepository.findAll();
    }
    public Fixture getByID(int id){
        return fixtureRepository.findById(id);
    }

}
