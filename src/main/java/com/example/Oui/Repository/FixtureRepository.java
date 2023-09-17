package com.example.Oui.Repository;

import com.example.Oui.DAO.Event.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FixtureRepository extends JpaRepository<Fixture, Integer> {
}
