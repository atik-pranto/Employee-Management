package demo.emplyoee.ems_backend.Employee.Repository;

import demo.emplyoee.ems_backend.Employee.Entiity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
