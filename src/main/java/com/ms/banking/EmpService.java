package com.ms.banking;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class EmpService {

    @Inject
    private EmpRepo repo;

    // saving employee into db
    protected void saveEmployeeDataInDB(Employee employee) {
        if(employee == null) {
            System.out.println("Employee Id Not Present");
        } else {
            employee = repo.save(employee);
        }
    }

    // employee get by id
    protected int getEmployeeById(int eid) throws EmployeeNotFoundException {
        if(eid == 0) {
            throw new EmployeeNotFoundException("Employee Does Not Exist With Given Id");
        } else if (eid <0){
            throw new EmployeeNotFoundException("Employee Id Should be Greater Than Zero");
        } else {
            Employee employee = repo.getById(eid);
        }
        return eid;
    }

    // getting List of All Employees In Db
    protected List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    // Getting List of Employee Count From DB
    protected Long gettingEmployeeCountFromDB() {
        return repo.count();
    }

    /*
    // checking increment status
    protected boolean employeeIncrementStatusCheck(int eid) {
        Employee employee = null;
        if (eid == 0) {
            return false;
        } (eid == employee.isIncrementStatus().equals(false)) {
            return false;
        }
    } */
}







