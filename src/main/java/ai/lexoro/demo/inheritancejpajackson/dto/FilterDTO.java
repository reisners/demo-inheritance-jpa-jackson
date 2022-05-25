package ai.lexoro.demo.inheritancejpajackson.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = MaudeFilterDTO.class),
        @JsonSubTypes.Type(value = BfarmFilterDTO.class) }
)
public abstract class FilterDTO {
}
