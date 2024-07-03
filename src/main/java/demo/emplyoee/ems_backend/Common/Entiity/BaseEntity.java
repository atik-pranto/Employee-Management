package demo.emplyoee.ems_backend.Common.Entiity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@ToString
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    private Date lastUpdatedDate;


    @PrePersist
    private void onCreate() {

        createdDate = (createdDate != null) ? createdDate : new Date();
        lastUpdatedDate=(lastUpdatedDate != null) ? lastUpdatedDate : new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        lastUpdatedDate = new Date();
    }
}
