package com.mc.donalds.repositories;

import com.mc.donalds.models.Codepromo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodepromoRepo extends JpaRepository<Codepromo,Long> {
}
