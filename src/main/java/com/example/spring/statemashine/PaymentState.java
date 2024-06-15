/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2024 VTB Group. All rights reserved.
 */

package com.example.spring.statemashine;

/**
 * @author Aleksandr_Berestov
 */
public enum PaymentState {
    NEW, PEW_AUTH, PRE_AUTH_ERROR, AUTH, AUTH_ERROR
}
