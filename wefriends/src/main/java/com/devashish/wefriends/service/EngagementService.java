package com.devashish.wefriends.service;

import com.devashish.wefriends.entity.Engagement;
import com.devashish.wefriends.repository.EngagementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EngagementService {
    @Autowired
    EngagementRepo engagementRepo;

    public void saveEngagement(Engagement engg){
        Engagement enggToReturn = engagementRepo.save(engg);
        System.out.println(enggToReturn);
    }
}
