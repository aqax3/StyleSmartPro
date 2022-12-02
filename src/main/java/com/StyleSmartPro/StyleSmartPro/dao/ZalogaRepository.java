package com.StyleSmartPro.StyleSmartPro.dao;

import com.StyleSmartPro.StyleSmartPro.models.Zaloga;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ZalogaRepository extends CrudRepository<Zaloga, Long> {
}
