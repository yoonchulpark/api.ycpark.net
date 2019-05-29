package ycpark.api.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import ycpark.api.entity.Company;

import java.util.List;

@Repository
@Mapper
public interface CompanyDao {

    List<Company> getCompanyList();

}