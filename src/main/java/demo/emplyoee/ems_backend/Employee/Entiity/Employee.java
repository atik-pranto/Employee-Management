package demo.emplyoee.ems_backend.Employee.Entiity;

import demo.emplyoee.ems_backend.Common.Entiity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;

    @Column(nullable = false)
    private String email;
}
