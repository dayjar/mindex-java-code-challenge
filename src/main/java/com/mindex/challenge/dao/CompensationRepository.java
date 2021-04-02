package com.mindex.challenge.dao;

import com.mindex.challenge.data.Compensation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompensationRepository extends MongoRepository<Compensation, String> {

    public Compensation findByEmployeeId(String employeeId);

    public <S extends Compensation> S insert(S entity);
}
