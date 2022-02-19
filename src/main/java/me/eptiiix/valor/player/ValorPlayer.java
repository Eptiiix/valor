package me.eptiiix.valor.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.eptiiix.valor.agent.Agent;

import java.util.UUID;

@Data
@AllArgsConstructor
public class ValorPlayer {

    private String name;
    private UUID uniqueId;
    private Agent agent;
    private int kills;
    private int deaths;
    private int assists;
    private int credits;
    private int orbPoints;

    public boolean hasUltimateReady() {
        return this.orbPoints == agent.getOrbPoints();
    }

    public boolean hasAgent() {
        return agent != null;
    }

}
