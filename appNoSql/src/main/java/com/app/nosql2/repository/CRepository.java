package com.app.nosql2.repository;

import com.app.nosql2.domain.C;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the C entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CRepository extends JpaRepository<C, Long> {}
