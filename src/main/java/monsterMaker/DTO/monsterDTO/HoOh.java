package monsterMaker.DTO.monsterDTO;

public class HoOh extends Monster{

    public void setHoOh(int level){
        MName = "칠색조";


        if (level == 1){
            MHp = 500;
        }else if(level == 2){
            MHp = 700;
        }else if(level == 3){
            MHp = 900;
        }

        if (level == 1){
            MProbability = 60;
        }else if(level == 2){
            MProbability = 65;
        }else if(level == 3){
            MProbability = 70;
        }

        if (level == 1){
            MDmg = 50;
        }else if(level == 2){
            MDmg = 100;
        }else if(level == 3){
            MDmg = 120;
        }

    }

}
