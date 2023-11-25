package com.devashish.wefriends.repository;

import com.devashish.wefriends.entity.Engagement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EngagementRepo extends CrudRepository<Engagement, Long> {
        public List<Engagement> findAll();
        public Engagement save(Engagement engg);
}
