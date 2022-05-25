package ai.lexoro.demo.inheritancejpajackson.model;

import ai.lexoro.demo.inheritancejpajackson.dto.FilterDTO;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "filter_type")
@Data
public abstract class Filter<DTO> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Date dateFrom;
    private Date dateTo;

    public abstract DTO toDTO();
}
