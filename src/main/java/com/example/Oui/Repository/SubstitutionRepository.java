package com.example.Oui.Repository;

import com.example.Oui.DAO.Event.Fixture;
import com.example.Oui.DAO.Event.Substitution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubstitutionRepository extends JpaRepository<Substitution, Integer> {

    List<Substitution> findByFixtureAndTeam(Fixture fixture, String team);

}
