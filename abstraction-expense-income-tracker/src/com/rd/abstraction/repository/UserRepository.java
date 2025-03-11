package com.rd.abstraction.repository;


import com.rd.abstraction.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository extends BaseRepository<User> {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUser(String username) {
        return users.get(username);
    }

    @Override
    public User get(int id) {
        return null; // Not applicable
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users.values());
    }
}

