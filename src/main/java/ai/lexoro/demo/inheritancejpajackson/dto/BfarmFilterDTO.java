package ai.lexoro.demo.inheritancejpajackson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
@JsonTypeName("bfarm")
@JsonDeserialize(builder = BfarmFilterDTO.BfarmFilterDTOBuilder.class)
public class BfarmFilterDTO extends FilterDTO {
    @JsonProperty
    String term;
}
