package com.example.Oui.Service;

import com.example.Oui.DAO.Event.Mark;
import com.example.Oui.DAO.Event.Penalty;
import com.example.Oui.Repository.MarkRepository;
import com.example.Oui.Repository.PenaltyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PenaltyService {
    private PenaltyRepository penaltyRepository;
    public List<Penalty> getAllPenalty(){
        return penaltyRepository.findAll();
    }
}
