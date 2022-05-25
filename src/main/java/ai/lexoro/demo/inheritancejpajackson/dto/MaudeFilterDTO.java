package ai.lexoro.demo.inheritancejpajackson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Builder
@Value
@JsonTypeName("maude")
@JsonDeserialize(builder = MaudeFilterDTO.MaudeFilterDTOBuilder.class)
public class MaudeFilterDTO extends FilterDTO {
    @JsonProperty
    String brandName;
}
