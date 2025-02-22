package kz.enu.rest.sportclub.controller;

import kz.enu.rest.sportclub.model.SportsClub;
import kz.enu.rest.sportclub.model.Player;
import kz.enu.rest.sportclub.model.Sport;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SportsClubController {

    private final List<SportsClub> clubs = new ArrayList<>();
    private final List<Player> players = new ArrayList<>();
    private final List<Sport> sports = new ArrayList<>();

    @PostMapping("/clubs")
    public String addClub(@RequestBody SportsClub club) {
        clubs.add(club);
        return "Club added successfully";
    }

    @GetMapping("/clubs")
    public List<SportsClub> getClubs() {
        return clubs;
    }

    @PostMapping("/players")
    public String addPlayer(@RequestBody Player player) {
        players.add(player);
        return "Player added successfully";
    }

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return players;
    }

    @PostMapping("/sports")
    public String addSport(@RequestBody Sport sport) {
        sports.add(sport);
        return "Sport added successfully";
    }

    @GetMapping("/sports")
    public List<Sport> getSports() {
        return sports;
    }
}
