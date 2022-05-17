package com.playerscoutingapp.controllers;
import com.playerscoutingapp.model.Player;
import com.playerscoutingapp.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
 * @author Sheika Abuthair
 * @Date : 16-05-2022
 * @Project : assignmentProject
 */
@RestController
@RequestMapping("/player-api")
/**
 *  @RequestMapping annotation for mapping all the incoming HTTP request URLs to the corresponding controller methods
 */
public class PlayerController {
    /**
     * The @Autowired annotation can be used to autowire bean on the setter method
     */
    IPlayerService iPlayerService;
    @Autowired
    public void setiPlayerService(IPlayerService iPlayerService) {
        this.iPlayerService = iPlayerService;
    }



    @PostMapping("/players")
    ResponseEntity<Void> addPlayer(@RequestBody Player player){
        iPlayerService.addPlayer(player);
    ResponseEntity<Void> responseEntity = ResponseEntity.status(HttpStatus.CREATED).build();
        return responseEntity;
    }

    @PutMapping("/players")
    ResponseEntity<Void> updatePlayer(Player player){
        iPlayerService.updatePlayer(player);
    ResponseEntity<Void> responseEntity = ResponseEntity.status(HttpStatus.ACCEPTED).build();
        return responseEntity;
    }

    @DeleteMapping("/players/playerId/{playerId}")
    ResponseEntity<Void> deletePlayer(@PathVariable ("playerId") int playerId){
        iPlayerService.deletePlayer(playerId);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","delete one player by Id");
        return ResponseEntity.status(HttpStatus.OK).headers(headers).build();

    }
    @GetMapping("/players/playerId/{playerId}")
    ResponseEntity<Player> getByPlayerId (int playerId){
        iPlayerService.getByPlayerId(playerId);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","get one player by Id");
        return ResponseEntity.status(HttpStatus.OK).headers(headers).build();
    }
    @GetMapping("/players")
    ResponseEntity<List<Player>> getAll(){
        List<Player> players =iPlayerService.getAll();
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting all players");
        ResponseEntity<List<Player>>responseEntity= new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/playerName/{playerName}")
    ResponseEntity<List<Player>> getByName(@PathVariable("playerName") String playerName){
    List<Player> players = iPlayerService.getByName(playerName);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting by playerName");
        ResponseEntity<List<Player>>responseEntity= new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/age/{age}")
   ResponseEntity <List<Player>> getByAge(@PathVariable("age") int age) {
    List<Player> players = iPlayerService.getByAge(age);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting by player's age");
        ResponseEntity<List<Player>>responseEntity= new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("/players/country/{country}")
    ResponseEntity<List<Player>> getByCountry(@PathVariable("country") String country){
        List<Player> players =iPlayerService.getByCountry(country);
    HttpHeaders headers = new HttpHeaders();
    headers.add("desc","getting by players's country");
    ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/batting/{batting}")
    ResponseEntity<List<Player>> getByBatting(@PathVariable("batting") String batting) {
     List<Player> players =iPlayerService.getByBatting(batting);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting by Batsman");
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("/players/bowling/{bowling}")
    ResponseEntity<List<Player>> getByBowling(@PathVariable("bowling") String bowling){
      List<Player> players =iPlayerService.getByBowling(bowling);
      HttpHeaders headers = new HttpHeaders();
      headers.add("desc","getting by Bowler");
      ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
      return responseEntity;
    }
    @GetMapping("/players/specialist/{specialist}")
    ResponseEntity<List<Player>> getBySpecialist(@PathVariable("specialist") String specialist) {
        List<Player> players =iPlayerService.getBySpecialist(specialist);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting by player's specialist");
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("/players/stateTeam/{stateTeam}")
    ResponseEntity<List<Player>> getByStateTeam(@PathVariable("stateTeam") String StateTeam){
       List<Player> players = iPlayerService.getByStateTeam(StateTeam);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting by player's stateTeam");
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;

    }
    @GetMapping("/players/teamName/{teamName}")
    ResponseEntity<List<Player>> getByTeamName(@PathVariable("teamName") String teamName){
     List<Player> players = iPlayerService.getByTeamName(teamName);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting by teamName");
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("/players/teamCity/{teamCity}")
    ResponseEntity<List<Player>> getByTeamCity(@PathVariable("teamCity") String city){
        List<Player> players = iPlayerService.getByTeamCity(city);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting by teamCity");
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
     }
     @GetMapping("/players/teamTrophies/{teamTrophies}")
    ResponseEntity<List<Player>> getByTeamTrophies(@PathVariable("teamTrophies") String trophies){
        List<Player> players =iPlayerService.getByTeamTrophies(trophies);
         HttpHeaders headers = new HttpHeaders();
         headers.add("desc","getting by trophies");
         ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
         return responseEntity;
    }
    @GetMapping("/players/league/{league}")
    ResponseEntity<List<Player>> getByLeague(@PathVariable("league") String league) {
     List<Player> players = iPlayerService.getByLeague(league);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting by league");
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/playerName/{playerName}/country/{country}")
    ResponseEntity<List<Player>> getByNameCountry(@PathVariable("playerName") String name,@PathVariable("country") String country){
        List<Player> players =iPlayerService.getByNameCountry(name, country);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting by player's name and country");
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/batting/{batting}/bowling/{bowling}")
    ResponseEntity<List<Player>> getByBattingBowling(@PathVariable("batting") String batting,@PathVariable("bowling") String bowling){
        List<Player> players = iPlayerService.getByBattingBowling(batting, bowling);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting by player's batting and bowling");
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/basePrice1/{basePrice}/basePrice2/{basePrice2}")
    ResponseEntity<List<Player>> getByPriceBetween(@PathVariable("basePrice1") int basePrice1,@PathVariable("basePrice2") int basePrice2) {
     List<Player> players = iPlayerService.getByPriceBetween(basePrice1, basePrice2);
     HttpHeaders headers = new HttpHeaders();
     headers.add("desc","getting by player's maxPrice and minPrice");
     ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
     return responseEntity;
    }

    }



