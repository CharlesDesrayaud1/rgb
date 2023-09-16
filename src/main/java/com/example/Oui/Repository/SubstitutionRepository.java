package com.example.Oui.Repository;

import com.example.Oui.DAO.Event.Substitution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubstitutionRepository extends JpaRepository<Substitution, Integer> {
}