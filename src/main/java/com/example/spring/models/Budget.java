/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2024 VTB Group. All rights reserved.
 */

package com.example.spring.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksandr_Berestov
 */
@ToString
@Getter
@Setter
@Embeddable
@Accessors(chain = true)
public class Budget {

    @Column(name = "section_id")
    private Long section;
    private String name;

}
