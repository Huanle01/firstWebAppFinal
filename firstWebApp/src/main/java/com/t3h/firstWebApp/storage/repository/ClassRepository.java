package com.t3h.firstWebApp.storage.repository;

import com.t3h.firstWebApp.storage.entity.CustomClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<CustomClass, Integer> {

}
