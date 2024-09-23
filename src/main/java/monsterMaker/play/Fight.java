package monsterMaker.play;

import monsterMaker.dto.Monster;

public class Fight {

    Monster hoOh = new HoOh();
    Monster troll = new Troll();
    Monster vampire = new Vampire();


    public void fightStart(){
        int M = (int)(Math.random()*3+1);
        if(M == 1){
            troll.startFight();
        }else if(M == 2){
            vampire.startFight();
        }else if(M == 3){
            hoOh.startFight();
        }


    }

}
