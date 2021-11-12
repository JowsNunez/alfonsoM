package com.alfomarina.repositories;

import com.alfomarina.models.Rating;
import com.alfomarina.models.RatingTeamMade;
import com.alfomarina.models.TeamMade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.sql.Date;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface RatingTeamMadeRepository extends JpaRepository<RatingTeamMade,Integer> {

    @Query( nativeQuery = true, value="select * from RatingTeamMade u where u.fromTeamMade = :fromT AND u.toTeamMade = :toT AND u.create_at=:create_at")
    RatingTeamMade findRatingTeamMade(@Param("fromT") Integer from, @Param("toT") Integer to,@Param("create_at") Timestamp create_at);
}
