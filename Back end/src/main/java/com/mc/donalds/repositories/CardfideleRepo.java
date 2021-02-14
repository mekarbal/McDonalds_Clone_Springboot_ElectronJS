package com.mc.donalds.repositories;

import com.mc.donalds.models.Cardfidele;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardfideleRepo extends JpaRepository<Cardfidele,Long> {
}
