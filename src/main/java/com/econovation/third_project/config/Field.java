package com.econovation.third_project.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Field {
    WEB("WEB"),
    APP("APP"),
    AI("AI"),
    GAME("GAME"),
    IOT("IoT"),
    ARVR("AR/VR"),
    NONE("선택없음");

    private final String fieldName;


}