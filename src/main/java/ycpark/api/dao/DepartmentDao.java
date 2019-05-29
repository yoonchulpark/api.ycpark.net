package ycpark.api.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import ycpark.api.entity.Company;
import ycpark.api.entity.Department;

import java.util.List;

@Repository
@Mapper
public interface DepartmentDao {

    List<Department> getDepartmentList(Department department);

}