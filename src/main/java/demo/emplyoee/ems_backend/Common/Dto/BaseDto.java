package demo.emplyoee.ems_backend.Common.Dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class BaseDto {
    private Long id;
    private Date createdDate;
    private Date lastUpdatedDate;
}
