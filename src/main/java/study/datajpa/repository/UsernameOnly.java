package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

//Projections
public interface UsernameOnly {

    //@Value("#{target.username + ' ' + target.age}")
    String getUsername();
}
