package monsterMaker.DTO.monsterDTO;

public class Vampire extends Monster{

    public void setVampire(int level){
        MName = "뱀파이어";


        if (level == 1){
            MHp = 350;
        }else if(level == 2){
            MHp = 350;
        }else if(level == 3){
            MHp = 350;
        }

        if (level == 1){
            MProbability = 70;
        }else if(level == 2){
            MProbability = 75;
        }else if(level == 3){
            MProbability = 80;
        }

        if (level == 1){
            MDmg = 50;
        }else if(level == 2){
            MDmg = 70;
        }else if(level == 3){
            MDmg = 90;
        }

    }

}
