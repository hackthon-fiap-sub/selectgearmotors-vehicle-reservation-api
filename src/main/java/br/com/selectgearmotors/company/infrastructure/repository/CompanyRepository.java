package br.com.selectgearmotors.company.infrastructure.repository;

import br.com.selectgearmotors.company.infrastructure.entity.company.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    CompanyEntity findByCode(String code);
    CompanyEntity findBySocialName(String name);
    CompanyEntity findByEmail(String email);
}
