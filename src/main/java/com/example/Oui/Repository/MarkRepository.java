package com.example.Oui.Repository;

import com.example.Oui.DAO.Event.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Integer> {
    Mark findById(int id);
}