package monsterMaker.play;

import monsterMaker.dto.WarriorInfo;

import java.util.Scanner;

public class FightVampire{
    Vampire vampire = new Vampire();
    WarriorInfo warrior = new WarriorInfo();
    Scanner sc = new Scanner(System.in);



    public int warriorEquipmentForVampire (String equipment) {
        int warriorDmg = 0;
        int random = (int) (Math.random()*10) + 1;

        if (equipment.equals("sword")){

            System.out.println("검이 통하지 않습니다!!!!!!!");

        }else if (equipment.equals("bow")){

            System.out.println("활이 통하지 않습니다!!!!!!!");


        }else if (equipment.equals("garlic")){
            if(random <=8){
                warriorDmg = (int)(Math.random()*50)+100;
                System.out.println("뱀파이어가 마늘냄새를 맡고 괴로워합니다.");
            }else{
                System.out.println("뱀파이어가 코를 막았습니다.");
            }

        }else{
            warriorDmg = 0;
            System.out.println("잘못 입력하셨습니다.");
        }
        return warriorDmg;
    }

    public int getVampireAttack() {
        int firstvamDmg = vampire.getMDmg();
        int random = (int) (Math.random() * 100) + 1;
        int vampireDmg = 0;
        if (random <= vampire.getMProbability()) {
            System.out.println("뱀파이어의 공격에 피격당했습니다.");
            vampireDmg = (int) (Math.random() * 100) + firstvamDmg;

        } else {
            System.out.println("옆으로 굴러 회피했습니다.");
            vampireDmg = 0;
        }

        return vampireDmg;
    }

}
