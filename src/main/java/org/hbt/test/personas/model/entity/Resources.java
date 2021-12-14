package org.hbt.test.personas.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "tbl_resource")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resources implements Serializable {

    private static final long serialVersionUID = 7868987510845976870L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String option;

}
