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

    @Query("SELECT f FROM Frizer f JOIN f.delovnoMesto dm JOIN dm.zaloge z WHERE z.id = ?1")
    List<Frizer> frizerKiImaNaZalogi(Long id);

    @Query("SELECT f FROM Frizer f JOIN f.delovnoMesto dm JOIN dm.zaloge z WHERE z.ime = ?1")
    List<Frizer> frizerKiImaNaZalogiIme(String ime);

    @Query("SELECT f FROM Frizer f JOIN f.delovniCas dc JOIN f.delovnoMesto dm WHERE dc.dolzinaIzvajanja = 8 AND dm.naziv = ?1")
    List<Frizer> frizerKiDelaVXSalonu8h(String ime);

}
