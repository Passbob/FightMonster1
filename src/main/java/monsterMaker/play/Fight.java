package monsterMaker.play;

import monsterMaker.DTO.monsterDTO.HoOh;
import monsterMaker.DTO.monsterDTO.Monster;
import monsterMaker.DTO.monsterDTO.Troll;
import monsterMaker.DTO.monsterDTO.Vampire;

public class Fight {

    FightHoOh hoOh = new FightHoOh();
    FightTroll troll = new FightTroll();
    FightVampire vampire = new FightVampire();


    public void fightStart(){

        //        int M = (int)(Math.random()*3+1);
        int M = 2;
        if(M == 1){
            troll.startFight();
        }else if(M == 2){
            vampire.startFight();
        }


    }

}
