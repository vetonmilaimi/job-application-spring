package com.veton.job_application_app.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Long id, Company updatedCompany);
    void createCompany(Company company);
    boolean deleteCompany(Long id);
    Company getCompany(Long id);
}
