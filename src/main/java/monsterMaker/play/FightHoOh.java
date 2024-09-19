package monsterMaker.play;

import monsterMaker.DTO.WarriorInfo;
import monsterMaker.DTO.monsterDTO.HoOh;

import java.util.Scanner;

public class FightHoOh {

    HoOh hoOh = new HoOh();
    WarriorInfo warrior = new WarriorInfo();
    Scanner sc = new Scanner(System.in);

    public int warriorEquipmentForHoOh (String equipment) {
        int warriorDmg = 0;
        int random = (int) (Math.random()*10) + 1;



        if (equipment.equals("sword")){
            if(random <=8){
                warriorDmg = (int)(Math.random()*100)+200;
                System.out.println("강한 일격이 들어갔습니다.");
            }else{
                System.out.println("빗나감!!");
            }

        }else if (equipment.equals("bow")){

            if(random <=8){
                warriorDmg = (int)(Math.random()*50)+50;
                System.out.println("피부가 두꺼워 화살이 박히지 않습니다.");
            }else{
                System.out.println("빗나감!!");
            }


        } if (equipment.equals("garlic")){
            warriorDmg = 0;
            System.out.println("마늘을 맛있게 먹습니다.");
        }
        return warriorDmg;
    }

    public int getHoOhAttack() {
        int random = (int) (Math.random()*100) + 1;
        int trollDmg = 0;
        if(random <= 3){
            System.out.println("트롤의 공격에 피격당했습니다.");
            trollDmg = (int)(Math.random()*100)+200;
        }else {
            System.out.println("옆으로 굴러 회피했습니다.");
            trollDmg = 0;
        }

        return trollDmg;
    }
}
