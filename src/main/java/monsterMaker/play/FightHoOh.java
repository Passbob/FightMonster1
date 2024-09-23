package monsterMaker.play;

import monsterMaker.dto.Monster;
import monsterMaker.dto.WarriorInfo;

import java.util.Scanner;

public class FightHoOh{

    Monster hoOh = new HoOh();
    WarriorInfo warrior = new WarriorInfo();
    Scanner sc = new Scanner(System.in);

    public int warriorEquipmentForHoOh (String equipment) {
        int warriorDmg = 0;
        int random = (int) (Math.random()*10) + 1;



        if (equipment.equals("sword")){
            if(random <=3){
                warriorDmg = (int)(Math.random()*50)+30;
                System.out.println("겨우 스쳤습니다.");
            }else{
                System.out.println("빗나감!!");
            }

        }else if (equipment.equals("bow")){

            if(random <=8){
                warriorDmg = (int)(Math.random()*50)+100;
                System.out.println("나이스 샷!!!");
            }else{
                System.out.println("빗나감!!");
            }


        }else if (equipment.equals("garlic")){
            warriorDmg = 0;
            System.out.println("공중제비를 돌며 마늘을 피했습니다.");
        }else{
            warriorDmg = 0;
            System.out.println("잘못 입력하셨습니다.");
        }
        return warriorDmg;
    }

    public int getHoOhAttack() {
        int random = (int) (Math.random()*100) + 1;
        int hoOhDmg = 0;
        int firsthoOhDmg = hoOh.getMDmg();
        if(random <= hoOh.getMProbability()){
            System.out.println("칠색조의 공격에 피격당했습니다.");
            hoOhDmg = (int)(Math.random()*100)+firsthoOhDmg;
        }else {
            System.out.println("옆으로 굴러 회피했습니다.");
            hoOhDmg = 0;
        }

        return hoOhDmg;
    }


}
