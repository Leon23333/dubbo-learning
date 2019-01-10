package com.xu.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.xu.entity.User;

@Repository
public interface UserRepository {
	int insert(User user);
	
	List<User> findAll();
}
