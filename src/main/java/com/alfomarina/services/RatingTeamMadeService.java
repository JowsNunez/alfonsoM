package com.alfomarina.services;

import com.alfomarina.DTO.RatingTeamMadeDTO;
import com.alfomarina.models.Rating;
import com.alfomarina.models.RatingTeamMade;
import com.alfomarina.models.TeamMade;
import com.alfomarina.repositories.RatingRepository;
import com.alfomarina.repositories.RatingTeamMadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class RatingTeamMadeService implements IRatingTeamMadeService{

    @Autowired
    private TeamMadeService service;
    @Autowired
    private RatingTeamMadeRepository repo;
    @Autowired
    private RatingRepository repoR;

    @Override
    public RatingTeamMadeDTO createRating(Integer idRating,Integer from, Integer to){

        TeamMade fromT = service.getOne(from);
        TeamMade toT = service.getOne(to);

        long time =new java.util.GregorianCalendar().getTimeInMillis();
        RatingTeamMade ratingtm =  this.repo.findRatingTeamMade(fromT.getIdTeamMade(),toT.getIdTeamMade(),new Timestamp(time));
        Rating rating =this.repoR.getById(idRating);
        System.out.println(rating);
        if(ratingtm!=null) { return null;}

        RatingTeamMade aux = new RatingTeamMade(){{
            setFrom1(fromT);
            setTo(toT);
            setIdRating(rating);
            setCreate_at(new Timestamp(time));
        }};

        RatingTeamMade aux2 = this.repo.save(aux);

        return new RatingTeamMadeDTO(){{
            setFrom(aux2.getFrom1().getIdTeamMade());
            setTo(aux2.getTo().getIdTeamMade());
            setIdRating(aux2.getIdRating().getIdRating());
        }};

    }

    @Override
    public RatingTeamMade create(RatingTeamMade ratingTeamMade) {
        return null;
    }

    @Override
    public RatingTeamMade getOne(Integer id) {
        return null;
    }

    @Override
    public RatingTeamMade update(Integer id) {
        return null;
    }
}
