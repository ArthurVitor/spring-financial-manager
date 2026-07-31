package dev.arthurvitor.financial.manager.domain.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity()
@Table(name = "tb_example_entity")
@NoArgsConstructor()
@Getter()
public class ExampleEntity extends BaseEntity {
    @Column(nullable = false)
    private String name;

    public ExampleEntity(String name) {
        this.name = name;
    }

    public void updateName(String newName) {
        this.name = newName;
    }
}
