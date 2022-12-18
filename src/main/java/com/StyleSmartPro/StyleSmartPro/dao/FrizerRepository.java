package com.StyleSmartPro.StyleSmartPro.dao;

import com.StyleSmartPro.StyleSmartPro.models.Frizer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FrizerRepository extends CrudRepository<Frizer, Long> {

    @Query("SELECT f FROM Frizer f WHERE f.delovnoMesto.id = ?2 and f.ime = ?1")
    List<Frizer> frizerjiVSalonu(String name, Long id);

    @Query("SELECT f FROM Frizer f WHERE f.delovnoMesto.naziv = ?1")
    List<Frizer> frizerjiVImenuSalona(String naziv);

}
