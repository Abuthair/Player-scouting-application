package com.playerscoutingapp.service;
import com.playerscoutingapp.model.Team;
import com.playerscoutingapp.repository.ITeamRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Sheika Abuthair
 * @Date : 16-05-2022
 * @Project : assignmentProject
 */
public class TeamServiceImpl implements ITeamService{
    /**
     * The @Autowired annotation can be used to autowire bean on the setter method
     */
    ITeamRepository iTeamRepository;
    @Autowired
    public void setiTeamRepository(ITeamRepository iTeamRepository) {
        this.iTeamRepository = iTeamRepository;
    }

    /**
     * addTeam this method implementation will allow us to  add teams
     * @param team
     */
    @Override
    public void addTeam(Team team) {
        iTeamRepository.save(team);
    }

    /**
     * updateTeam this method implementation will allow us to update teams
     * @param team
     */
    @Override
    public void updateTeam(Team team) {
        iTeamRepository.save(team);
    }

    /**
     * deleteTeam this method implementation will allow us to delete team using teamId
     * @param teamId
     */
    @Override
    public void deleteTeam(int teamId) {
        iTeamRepository.deleteById(teamId);
    }

    /**
     * getById this method implementation will allow us to get the team using teamId
     * @param TeamId
     *
     */
    @Override
    public Team getById(int TeamId) {
        return iTeamRepository.findById(TeamId).get();
    }
}
