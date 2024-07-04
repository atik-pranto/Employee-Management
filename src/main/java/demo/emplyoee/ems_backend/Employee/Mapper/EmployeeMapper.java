package demo.emplyoee.ems_backend.Employee.Mapper;

import demo.emplyoee.ems_backend.Employee.Dto.EmployeeDto;
import demo.emplyoee.ems_backend.Employee.Entiity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {

        return new EmployeeDto(
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {

        return new Employee(
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
