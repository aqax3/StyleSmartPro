package com.StyleSmartPro.StyleSmartPro.dao;

import com.StyleSmartPro.StyleSmartPro.models.Zaloga;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ZalogaRepository extends CrudRepository<Zaloga, Long> {
@Query("select z from Zaloga z where kolicina < 3 and kolicina > 7")
    List<Zaloga> vrniKolicine(int zaloga);
}
