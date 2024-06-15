/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2024 VTB Group. All rights reserved.
 */

package com.example.spring.statemashine;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aleksandr_Berestov
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
