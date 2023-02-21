package it.develhope.noSqlOrm01.Repositories;

import it.develhope.noSqlOrm01.Entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

