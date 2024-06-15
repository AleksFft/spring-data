/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2024 VTB Group. All rights reserved.
 */

package com.example.spring.repository;

import com.example.spring.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aleksandr_Berestov
 */
public interface RecordRepository extends JpaRepository<Record, Long> {
}
