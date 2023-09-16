package com.example.Oui.Service;


import com.example.Oui.DAO.Event.Mark;
import com.example.Oui.Repository.MarkRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MarkService {
    private MarkRepository markRepository;
    public List<Mark> getAllMark(){
        return markRepository.findAll();
    }
}
