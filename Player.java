/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playerrankingsystems;

/**
 *
 * @author User
 */
public class Player {
    private String PlayerId;
    private String name;
    private String teamName;
    private double score;
    
    public Player(String PlayerId, String name, String teamname, double score) {
        this.PlayerId = PlayerId;
        this.name = name;
        this.teamName = teamname;
        this.score = score;
    }
    
    public String getPlayerId() {return PlayerId;}
    public String getname() {return name;}
    public String getteamName() {return teamName;}
    public double getscore() {return score;}
    
}
