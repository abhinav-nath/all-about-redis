package com.codecafe.redis.kickstart.persistence;

import com.codecafe.redis.kickstart.model.User;

import java.util.Map;

public interface UserRepository {

    public void save(User user);

    public Map<String, User> findAll();

    public User findById(String id);

    public void update(User user);

    public void delete(String id);

}