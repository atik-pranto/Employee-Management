package demo.emplyoee.ems_backend.Employee.Service;

import demo.emplyoee.ems_backend.Employee.Dto.EmployeeDto;
import demo.emplyoee.ems_backend.Employee.Entiity.Employee;
import demo.emplyoee.ems_backend.Employee.Mapper.EmployeeMapper;
import demo.emplyoee.ems_backend.Employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
