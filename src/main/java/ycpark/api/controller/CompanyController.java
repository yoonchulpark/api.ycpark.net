package ycpark.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ycpark.api.service.CompanyService;

import java.util.HashMap;

@RestController
@RequestMapping(value="/companies")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @RequestMapping(value="", method= RequestMethod.GET)
    public ResponseEntity<?> getCompanyList(){
        HashMap<String, Object> result = new HashMap<>();

        result.put("data", companyService.getCompanyList());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
