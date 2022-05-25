package ai.lexoro.demo.inheritancejpajackson.model;

import ai.lexoro.demo.inheritancejpajackson.dto.MaudeFilterDTO;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class MaudeFilter extends Filter<MaudeFilterDTO> {
    private String brandName;

    @Override
    public MaudeFilterDTO toDTO() {
        return MaudeFilterDTO.builder().brandName(brandName).build();
    }
}
