import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
Written By Christopher Pucko
EECS Linear Data Structures Project 0

This is the main class for this project. It reads from the included playerlist.txt, stores each player as a
specific "Player" object by position, then prints the player's stats in a labeled, easy to read list in the console.
 */

public class PlayerListReader {
    public static void main(String[] args) {
        Player newPlayer;
        int ElementsLoaded;
        String PosName, PlayerName, intParse, floatParse, hasNextLine;
        float Weight, Sacks;
        int Age, Tackles, Intercepts, Recepts, ReceptYards, Rushes, RushYards, Touchdowns,
                Fumbles, PassAttempts, PassCompletes, PassYards, i;
        ArrayList<Player> Players = new ArrayList();
        ElementsLoaded = 0;

        try {
            FileReader file = new FileReader(new File("playerlist.txt"));
            BufferedReader r = new BufferedReader(file);
            System.out.println("File Opened. Loading Players.....");
            System.out.println();


            while ((hasNextLine = r.readLine()) != null) {
                PosName = hasNextLine;
                PlayerName = r.readLine();
                floatParse = r.readLine();
                Weight = Float.parseFloat(floatParse);
                Age = ParseInt(r.readLine());

                if (PosName.contains("Quarterback")) {
                    PassAttempts = ParseInt(r.readLine());
                    PassCompletes = ParseInt(r.readLine());
                    PassYards = ParseInt(r.readLine());
                    Rushes = ParseInt(r.readLine());
                    RushYards = ParseInt(r.readLine());
                    Touchdowns = ParseInt(r.readLine());
                    Intercepts = ParseInt(r.readLine());
                    Fumbles = ParseInt(r.readLine());
                    floatParse = r.readLine();
                    Sacks = Float.parseFloat(floatParse);

                        /*Keep an eye here and at the other constructors.
                          Worried that by using one variable "newPlayer" that the pointer in the array might just overwrite
                          Might lead to repeated printouts of last player.
                        */
                    newPlayer = new Quarterback(PlayerName, PosName, Weight, Age, PassAttempts, PassCompletes,
                            PassYards, Rushes, RushYards, Touchdowns, Intercepts, Fumbles, Sacks);
                    Players.add(newPlayer);
                    ElementsLoaded++;

                } else if (PosName.contains("Defense")) {
                    Tackles = ParseInt(r.readLine());
                    floatParse = r.readLine();
                    Sacks = Float.parseFloat(floatParse);
                    Intercepts = ParseInt(r.readLine());

                    newPlayer = new Defense(PlayerName, PosName, Weight, Age, Sacks, Tackles, Intercepts);

                    Players.add(newPlayer);
                    ElementsLoaded++;
                } else if (PosName.contains("Receiver")) {
                    Recepts = ParseInt(r.readLine());
                    ReceptYards = ParseInt(r.readLine());
                    Rushes = ParseInt(r.readLine());
                    RushYards = ParseInt(r.readLine());
                    Touchdowns = ParseInt(r.readLine());
                    Fumbles = ParseInt(r.readLine());

                    newPlayer = new Reciever(PlayerName, PosName, Weight, Age, Recepts, ReceptYards, Rushes,
                            RushYards, Touchdowns, Fumbles);

                    Players.add(newPlayer);
                    ElementsLoaded++;
                }

            }
            for (i = 0; i < ElementsLoaded; i++) {
                Player writingPlayer = Players.get(i);

                System.out.println(writingPlayer.getName());
                System.out.println("Age: " + writingPlayer.getAge());
                System.out.println(writingPlayer.getPosition());
                System.out.println("Weight: " + writingPlayer.getWeight());

                if (writingPlayer.getPosition().contains("Quarterback")) {
                    Quarterback player = (Quarterback) writingPlayer;

                    System.out.println("Pass Attempts: " + player.getPassAttempt());
                    System.out.println("Pass Completes: " + player.getPassComplete());
                    System.out.println("Passing Yards: " + player.getPassYards());
                    System.out.println("Rush Attempts: " + player.getRushAttempt());
                    System.out.println("Rush Yards: " + player.getRushYards());
                    System.out.println("Touchdowns; " + player.getTouchdowns());
                    System.out.println("Interceptions: " + player.getIntercepts());
                    System.out.println("Fumbles: " + player.getFumbles());
                    System.out.println("Sacks: " + player.getSacks());
                    System.out.println();

                } else if (writingPlayer.getPosition().contains("Defense")) {
                    Defense player = (Defense) writingPlayer;

                    System.out.println("Tackles: " + player.getTackles());
                    System.out.println("Sacks: " + player.getSacks());
                    System.out.println("Interceptions: " + player.getIntercepts());
                    System.out.println();

                } else if (writingPlayer.getPosition().contains("Receiver")) {
                    Reciever player = (Reciever) writingPlayer;
                    System.out.println("Receptions: " + player.getReceptions());
                    System.out.println("Reception Yards: " + player.getReceptionYards());
                    System.out.println("Rushes: " + player.getRushes());
                    System.out.println("Rushing Yards: " + player.getRushingYards());
                    System.out.println("Touchdowns; " + player.getTouchdowns());
                    System.out.println("Fumbles: " + player.getFumbles());
                    System.out.println();
                }


            }


        } catch (IOException e) {
            System.out.println("File Exception");
        }
    }

    public static int ParseInt(String r) {
        int returnValue;

        returnValue = Integer.parseInt(r);

        return returnValue;
    }


}

