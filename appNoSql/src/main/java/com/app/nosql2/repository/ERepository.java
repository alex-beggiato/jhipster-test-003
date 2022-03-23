package com.app.nosql2.repository;

import com.app.nosql2.domain.E;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the E entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ERepository extends JpaRepository<E, Long> {}
