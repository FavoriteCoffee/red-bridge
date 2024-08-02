package com.bridge.red.back.dto;

import com.bridge.red.back.model.Attachment;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardInfo {
    private String name;
    private Attachment attachment;
}
