package monsterMaker.play;

import monsterMaker.DTO.Level;
import monsterMaker.DTO.WarriorInfo;
import monsterMaker.DTO.monsterDTO.Vampire;

import java.util.Scanner;

public class FightVampire {
    Vampire vampire = new Vampire();
    WarriorInfo warrior = new WarriorInfo();
    Scanner sc = new Scanner(System.in);


    public void startFight(){
        vampire.setVampire(Level.getLevel());
        warrior.setWarriorHp(Level.getLevel());
        System.out.println("마을에 도착하기 전 폐허에서 웃음소리가 들립니다!!");
        System.out.println("위험을 지나치면 용사가 아니죠!");
        System.out.println("아무키나 입력하고 전투를 시작하세요");
        sc.nextLine();
        System.out.println(vampire.appearance());
        int monsterHp = vampire.getMHp();
        int warriorHp = warrior.getWarriorHp();
        for (int i = 0; i < 100; i++) {
            System.out.println("sword , bow, garlic");
            System.out.print("공격할 장비를 입력해주세요 : ");
            monsterHp -= warriorEquipmentForVampire(sc.nextLine());
            System.out.println(vampire.getMName() + " HP : " + monsterHp);
            System.out.println();
            int vamA = getVampireAttack();
            warriorHp -= vamA;
            monsterHp += vamA/2;
            System.out.println(warrior.getWarriorName() + "의 남은 HP : " + warriorHp);
            System.out.println(vampire.getMName() + "가 " + vamA/2 +"만큼 흡혈을 합니다!!");
            System.out.println(vampire.getMName() + " HP : " + monsterHp);
            if (monsterHp <= 0) {
                break;
            } else if (warriorHp <= 0) {
                break;
            }
        }
        System.out.println("숲을 떠납니다.");
    }



    public int warriorEquipmentForVampire (String equipment) {
        int warriorDmg = 0;
        int random = (int) (Math.random()*10) + 1;

        if (equipment.equals("sword")){

            System.out.println("검이 통하지 않습니다!!!!!!!");

        }else if (equipment.equals("bow")){

            System.out.println("활이 통하지 않습니다!!!!!!!");


        } if (equipment.equals("garlic")){
            if(random <=8){
                warriorDmg = (int)(Math.random()*50)+100;
                System.out.println("뱀파이어가 마늘냄새를 맡고 괴로워합니다.");
            }else{
                System.out.println("뱀파이어가 코를 막았습니다.");
            }

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
