package monsterMaker.play;

import monsterMaker.dto.Level;
import monsterMaker.dto.Monster;
import monsterMaker.dto.WarriorInfo;

import java.util.Scanner;

public class Vampire extends Monster {
    FightVampire vampire = new FightVampire();
    WarriorInfo warrior = new WarriorInfo();
    Scanner sc = new Scanner(System.in);

    public void setVampire(int level){
        setMName("뱀파이어");


        if (level == 1){
            setMHp(350);
        }else if(level == 2){
            setMHp(350);
        }else if(level == 3){
            setMHp(350);
        }

        if (level == 1){
            setMProbability(70);
        }else if(level == 2){
            setMProbability(75);
        }else if(level == 3){
            setMProbability(80);
        }

        if (level == 1){
            setMDmg(50);
        }else if(level == 2){
            setMDmg(70);
        }else if(level == 3){
            setMDmg(90);
        }

    }

    @Override
    public void startFight(){
        setVampire(Level.getLevel());
        warrior.setWarriorHp(Level.getLevel());
        System.out.println("마을에 도착하기 전 폐허에서 웃음소리가 들립니다!!");
        System.out.println(" (；☉_☉)      (≖⑉≖├┬┴┬┴ ");
        System.out.println();
        System.out.println("위험을 지나치면 용사가 아니죠!");
        System.out.println(" (૭ ఠ༬ఠ)૭     (૭ ఠ༬ఠ)૭ ");
        System.out.println();
        System.out.print("아무키나 입력하고 전투를 시작하세요. : ");
        sc.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(appearance());
        System.out.println();
        System.out.println();
        int monsterHp = getMHp();
        int warriorHp = warrior.getWarriorHp();
        for (int i = 0; i < 100; i++) {
            System.out.println();
            System.out.println("===sword , bow, garlic===");
            System.out.println();
            System.out.print("공격할 장비를 입력해주세요 : ");
            monsterHp -= vampire.warriorEquipmentForVampire(sc.nextLine());
            if(monsterHp < 0){
                monsterHp = 0;
            }
            System.out.println(getMName() + " HP : " + monsterHp);
            if (monsterHp == 0) {
                System.out.println("뱀파이어가 쓰러졌습니다!");
                System.out.println();
                System.out.println();
                break;
            }
            System.out.println();
            int vamA = vampire.getVampireAttack();
            warriorHp -= vamA;
            monsterHp += vamA/2;
            if(warriorHp < 0){
                warriorHp = 0;
            }
            System.out.println(warrior.getWarriorName() + "의 남은 HP : " + warriorHp);
            System.out.println();
            System.out.println(getMName() + "가 " + vamA/2 +"만큼 흡혈을 합니다!!");
            System.out.println(getMName() + " HP : " + monsterHp);
            if (warriorHp == 0) {
                WarriorInfo.setRetire(0);
                break;
            }
        }
        System.out.println("숲을 떠납니다.");
    }



}
