package com.playerscoutingapp.repository;

import com.playerscoutingapp.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sheika Abuthair
 * @Date : 16-05-2022
 * @Project : assignmentProject
 */
@Repository
public interface ITeamRepository extends JpaRepository<Team,Integer> {
}
