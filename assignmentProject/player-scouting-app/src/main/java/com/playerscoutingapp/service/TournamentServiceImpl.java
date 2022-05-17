package com.playerscoutingapp.service;

import com.playerscoutingapp.model.Tournament;
import com.playerscoutingapp.repository.ITournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Sheika Abuthair
 * @Date : 16-05-2022
 * @Project : assignmentProject
 */
public class TournamentServiceImpl implements  ITournamentService{
    /**
     * The @Autowired annotation can be used to autowire bean on the setter method
     */
    ITournamentRepository iTournamentRepository;
    @Autowired
    public void setiTournamentRepository(ITournamentRepository iTournamentRepository) {
        this.iTournamentRepository = iTournamentRepository;
    }

    /**
     * addTournament this method implementation will allow us to add tournament
     * @param tournament
     */
    @Override
    public void addTournament(Tournament tournament) {
        iTournamentRepository.save(tournament);
    }

    /**
     * updateTournament this method implementation will allow us to update tournament
     * @param tournament
     */
    @Override
    public void updateTournament(Tournament tournament) {
       iTournamentRepository.save(tournament);
    }

    /**
     * deleteTournament this method implementation will allow us to delete tournament using tournamentId
     * @param tournamentId
     */
    @Override
    public void deleteTournament(int tournamentId) {
     iTournamentRepository.deleteById(tournamentId);
    }

    /**
     *getById this method implementation will allow us to get tournament using tournamentId
     * @param tournamentId
     */
    @Override
    public Tournament getById(int tournamentId) {
        return iTournamentRepository.findById(tournamentId).get();
    }
}
