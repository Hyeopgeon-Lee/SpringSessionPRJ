package kopo.poly.dto;

import lombok.Builder;

@Builder
public record SessionDTO(
        String sessionName,
        String sessionValue,
        String sessionId) {
}
