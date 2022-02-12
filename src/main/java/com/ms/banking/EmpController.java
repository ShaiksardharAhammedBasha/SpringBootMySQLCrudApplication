package com.ms.banking;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping(value="banking")
public class EmpController {

    @Inject
    EmpService service;

    // saving data into db
    @PostMapping(value="/saveEmployee")
    public void saveEmployee(@RequestBody Employee employee) {
        service.saveEmployeeDataInDB(employee);
    }

    // getting employee by id
    @GetMapping(value = "/employee/{id}")
    public int gettingEmployeeBid(@PathVariable("id") int eid) throws EmployeeNotFoundException {
        return service.getEmployeeById(eid);
    }

    @GetMapping(value="/employees")
    public List<Employee> gettingListOfAllEmployees() {
        return service.getAllEmployee();
    }

    // checking Increment Status

}







