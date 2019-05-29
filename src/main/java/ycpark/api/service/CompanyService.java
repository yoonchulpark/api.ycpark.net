package ycpark.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ycpark.api.dao.CompanyDao;
import ycpark.api.dao.DepartmentDao;
import ycpark.api.entity.Company;
import ycpark.api.entity.Department;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    DepartmentDao departmentDao;

    public List<Company> getCompanyList() {

        List<Company> companyList = companyDao.getCompanyList();

        for (Company company : companyList)
        {
            Department department = new Department();
            department.setCompanyNo(company.getCompanyNo());
            List<Department> departmentList = departmentDao.getDepartmentList(department);
            company.setDepartmentList(departmentList);
        }

        return companyList;
    }
}