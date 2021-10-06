package com.hsc.employee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="dept_seq" )
    @SequenceGenerator(initialValue=100,name="dept_seq",sequenceName = "dept_sequence")
    public Integer deptId;
    public String deptName;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    public List<Employee> employees;


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptCode='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
