package ai.lexoro.demo.inheritancejpajackson.model;

import ai.lexoro.demo.inheritancejpajackson.dto.BfarmFilterDTO;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class BfarmFilter extends Filter<BfarmFilterDTO> {
    private String term;


    @Override
    public BfarmFilterDTO toDTO() {
        return BfarmFilterDTO.builder().term(term).build();
    }
}
