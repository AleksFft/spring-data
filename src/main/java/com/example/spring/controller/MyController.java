/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2024 VTB Group. All rights reserved.
 */

package com.example.spring.controller;

import com.example.spring.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aleksandr_Berestov
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/post")
public class MyController {

    private final RecordRepository recordRepository;

    @PostMapping("/uploadFile")
    ResponseEntity<String> post(MultipartFile file) throws IOException {
        String contentType = file.getContentType();

        ByteArrayInputStream bis = new ByteArrayInputStream(file.getBytes(), 0, file.getBytes().length);
        String encoding = new InputStreamReader(bis).getEncoding();

        return ResponseEntity.ok().body("file received successfully" +
                "\n"+ file.getOriginalFilename() +
                "\n" + file.getContentType() +
                "\n encoding = " + encoding);
    }

    @PostMapping("/session-id")
    ResponseEntity<String> post(@RequestParam("sessionId") String sessionId) {
        return ResponseEntity.ok().body("file received successfully" +
                "\n" + sessionId);
    }


}
