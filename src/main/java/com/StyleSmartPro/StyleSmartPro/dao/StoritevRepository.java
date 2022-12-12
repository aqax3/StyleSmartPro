package com.StyleSmartPro.StyleSmartPro.dao;

import com.StyleSmartPro.StyleSmartPro.models.Storitev;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface StoritevRepository extends CrudRepository<Storitev, Long> {
    @Query ("SELECT storitev FROM Storitev storitev WHERE spol = ?1 and priblizenCasTrajanja > ?2" )
    List<Storitev> vrniStoritveZaZenske(String spol, int cas);
}
