/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2024 VTB Group. All rights reserved.
 */

package com.example.spring.models;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * @author Aleksandr_Berestov
 */
@RequiredArgsConstructor
public enum SideTypeDto {

    DEBIT("Д"),
    CREDIT("К");

    private final String side;

    public static SideTypeDto get(String value) {
        return Arrays.stream(SideTypeDto.values())
                .filter(v -> v.side.equalsIgnoreCase(value))
                .findFirst()
                .orElse(null);
    }
}
