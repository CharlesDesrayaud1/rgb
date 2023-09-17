package com.example.Oui.Repository;

import com.example.Oui.DAO.Event.Fixture;
import com.example.Oui.DAO.Event.Penalty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PenaltyRepository extends JpaRepository<Penalty, Integer> {

    List<Penalty> findByFixtureAndTeam(Fixture fixture, String team);

}
