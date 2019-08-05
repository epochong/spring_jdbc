package com.epochong.vo;

/**
 * @author epochong
 * @date 2019/8/2 23:27
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Employee {
    private int employeeId;

    private String employeeName;

    public Employee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
