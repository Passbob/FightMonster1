package monsterMaker.play;

import monsterMaker.dto.Level;
import monsterMaker.dto.Monster;
import monsterMaker.dto.WarriorInfo;

import java.util.Scanner;

public class Troll extends Monster {

    FightTroll troll = new FightTroll();
    Scanner sc = new Scanner(System.in);
    WarriorInfo warrior = new WarriorInfo();

    public void setTroll(int level){
        setMName("트롤");


        if (level == 1){
            setMHp(1000);
        }else if(level == 2){
            setMHp(1500);
        }else if(level == 3){
            setMHp(2000);
        }

        if (level == 1){
            setMProbability(20);
        }else if(level == 2){
            setMProbability(25);
        }else if(level == 3){
            setMProbability(35);
        }

        if (level == 1){
            setMDmg(200);
        }else if(level == 2){
            setMDmg(250);
        }else if(level == 3){
            setMDmg(300);
        }

    }

    @Override
    public void startFight(){
        setTroll(Level.getLevel());
        warrior.setWarriorHp(Level.getLevel());
        System.out.println("숲을 지나가다가 엄청나게 큰 발소리가 들립니다.");
        System.out.println(" ૮( ´⁰▱๋⁰` )ა   ૮( ´⁰▱๋⁰` )ა ");
        System.out.println();
        System.out.println("위험을 지나치면 용사가 아니죠!");
        System.out.println("༼ง=ಠ益ಠ=༽ง    ༼ง=ಠ益ಠ=༽ง");
        System.out.println();
        System.out.print("아무키나 입력하고 전투를 시작하세요 : ");
        sc.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(appearance());
        System.out.println();
        System.out.println();
        int trollHp = getMHp();
        int warriorHp = warrior.getWarriorHp();
        for (int i = 0; i < 100; i++) {
            System.out.println();
            System.out.println("===sword , bow, garlic===");
            System.out.println();
            System.out.print("공격할 장비를 입력해주세요 : ");
            trollHp -= troll.warriorEquipmentForTroll(sc.nextLine());
            if(trollHp < 0){
                trollHp = 0;
            }
            System.out.println("트롤 HP : " + trollHp);
            if (trollHp == 0) {
                System.out.println("트롤이 쓰러졌습니다!!");
                System.out.println();
                System.out.println();
                break;
            }
            System.out.println();
            System.out.println();
            warriorHp -= troll.getTrollAttack();
            if(warriorHp < 0){
                warriorHp = 0;
            }
            System.out.println(warrior.getWarriorName() + "의 남은 HP : " + warriorHp);
            System.out.println();
            System.out.println();
            if (warriorHp == 0) {
                WarriorInfo.setRetire(0);
                break;
            }
        }
        System.out.println("숲을 떠납니다.");
    }
}
