package com.ms.banking;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="bank_emp_status")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eid;

    private String ename;
    private String city;
    private String branch;
    private long pincode;
    private Double salary;

    private boolean incrementStatus;
}
