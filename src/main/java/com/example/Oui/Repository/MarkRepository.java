package com.example.Oui.Repository;

import com.example.Oui.DAO.Event.Fixture;
import com.example.Oui.DAO.Event.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Integer> {
    Mark findById(int id);
    List<Mark> findByTeam(String team);
    List<Mark> findByFixtureAndTeam(Fixture fixture, String team);
}
