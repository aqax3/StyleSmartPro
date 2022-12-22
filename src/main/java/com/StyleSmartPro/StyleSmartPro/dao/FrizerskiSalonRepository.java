package com.StyleSmartPro.StyleSmartPro.dao;

import com.StyleSmartPro.StyleSmartPro.models.Frizer;
import com.StyleSmartPro.StyleSmartPro.models.FrizerskiSalon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FrizerskiSalonRepository extends CrudRepository<FrizerskiSalon, Long> {

    /*@Query ("SELECT fs FROM FrizerskiSalon fs WHERE fs.zaloge.kolicina = ?1")
    List<FrizerskiSalon> vrniFSKjerZalogaVecjaOd(Integer kolicina);*/
}
