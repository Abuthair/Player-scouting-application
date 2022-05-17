package com.playerscoutingapp.repository;

import com.playerscoutingapp.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Sheika Abuthair
 * @Date : 16-05-2022
 * @Project : assignmentProject
 */

@Repository

public interface IPlayerRepository extends JpaRepository<Player,Integer> {
    /**
     * this query helps us to find list of players by name
     * @param playerName
     *
     */
    @Query("from Player p where p.playerName=?1")
    List<Player> findByName(String playerName);

    /**
     * this query helps us to find list of players by age
     * @param age
     */
    @Query("from Player p where p.age<=?1")
    List<Player> findByAge(int age) ;

    /**
     * this query helps us to find list of players by country
     * @param country
     */
    @Query("from Player p where p.country=?1")
    List<Player> findByCountry(String country) ;

    /**
     * this query helps us find list of players by batting
     * @param batting
     */
    @Query("from Player p where p.batting=?1")
    List<Player> findByBatting(String batting) ;

    /**
     * this query helps us find list of players by bowling
     * @param bowling
     */
    @Query("from Player p where p.bowling=?1")
    List<Player> findByBowling(String bowling) ;

    /**
     * this query helps us find list of players by specialist
     * @param specialist
     */
    @Query("from Player p where p.specialist=?1")
    List<Player> findBySpecialist(String specialist) ;

    /**
     * this query helps us find list of players by stateTeam
     * @param StateTeam
     */
    @Query("from Player p where p.stateTeam=?1")
    List<Player> findByStateTeam(String StateTeam) ;

    /**
     * this query helps us find list of players by teamName
     * @param teamName
     */
    @Query("from Player p inner join p.teams t where t.teamName=?1")
    List<Player> findByTeamName(String teamName) ;

    /**
     * this query helps us find list of players by city
     * @param city
     */
    @Query("from Player p inner join p.teams t where t.city=?1")
    List<Player> findByTeamCity(String city) ;

    /**
     * this query helps us find list of players by trophies
     * @param trophies
     */
    @Query("from Player p inner join p.teams t where t.trophies=?1")
    List<Player> findByTeamTrophies(String trophies) ;

    /**
     * this query helps us find list of players by league
     * @param league
     */
    @Query("from Player p inner join p.teams t where t.league=?1")
    List<Player> findByLeague(String league) ;

    /**
     * this query helps us find list of players by name and country
     * @param name
     * @param country
     */
    @Query("from Player p where p.playerName=?1 and p.country=?2")
    List<Player> findByNameCountry(String name, String country) ;

    /**
     * this query helps us find list of players by batting and bowling
     * @param batting
     * @param bowling
     */
    @Query("from Player p where p.batting=?1 and p.bowling=?2")
    List<Player> findByBattingBowling(String batting, String bowling) ;

    /**
     * this query helps us find list of players basePrice between basePrice1 and basePrice2
     * @param basePrice1
     * @param basePrice2
     */
    @Query("from Player p where p.basePrice between ?1 and ?2")
    List<Player> findByPriceBetween(int basePrice1,int basePrice2) ;

}
