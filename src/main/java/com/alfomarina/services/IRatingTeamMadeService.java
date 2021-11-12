package com.alfomarina.services;

import com.alfomarina.DTO.RatingTeamMadeDTO;
import com.alfomarina.models.RatingTeamMade;
import com.alfomarina.models.TeamMade;
import org.springframework.stereotype.Service;

@Service
public interface IRatingTeamMadeService extends BaseService<RatingTeamMade> {
     RatingTeamMadeDTO createRating(Integer idRating, Integer from, Integer to);
}
