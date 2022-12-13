package com.StyleSmartPro.StyleSmartPro.dao;

import com.StyleSmartPro.StyleSmartPro.models.Frizer;
import com.StyleSmartPro.StyleSmartPro.models.FrizerskiSalon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FrizerskiSalonRepository extends CrudRepository<FrizerskiSalon, Long> {
    @Query ("SELECT COUNT(*) FROM Frizer f WHERE f.delovnoMesto = ?1")
    Integer steviloZaposlenih(FrizerskiSalon fs);

    /*@Query ("SELECT * FROM Frizer f WHERE f.delovnoMesto = ?1")
    Iterable<Frizer> vrniZaposlene(FrizerskiSalon fs);*/
}
