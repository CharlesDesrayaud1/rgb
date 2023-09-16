package com.example.Oui.Repository;

import com.example.Oui.DAO.Event.Penalty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenaltyRepository extends JpaRepository<Penalty, Integer> {
}
