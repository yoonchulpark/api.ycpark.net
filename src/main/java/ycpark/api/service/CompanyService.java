package ycpark.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ycpark.api.dao.CompanyDao;
import ycpark.api.entity.Company;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyDao companyDao;

    public List<Company> getCompanyList() {

        List<Company> companyList = companyDao.getCompanyList();

        return companyList;
    }
}