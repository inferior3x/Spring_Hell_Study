package com.econovation.hellstudy.DTO;

import lombok.Getter;
import lombok.Setter;

public record ChatRes(long messageNumber, String userId, String message, long createdTime) {
}
