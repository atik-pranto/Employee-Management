package demo.emplyoee.ems_backend.Employee.Dto;

import demo.emplyoee.ems_backend.Common.Dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class EmployeeDto {
    private String firstName;
    private String lastName;
    private String email;
}
