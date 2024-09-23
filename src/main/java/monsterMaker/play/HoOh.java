package monsterMaker.play;

import monsterMaker.dto.Level;
import monsterMaker.dto.Monster;
import monsterMaker.dto.WarriorInfo;

import java.util.Scanner;

public class HoOh extends Monster {

    FightHoOh hoOh = new FightHoOh();
    WarriorInfo warrior = new WarriorInfo();
    Scanner sc = new Scanner(System.in);

    public void setHoOh(int level){
        setMName("칠색조");
        if (level == 1){
            setMHp(500);
        }else if(level == 2){
            setMHp(700);
        }else if(level == 3){
            setMHp(900);
        }

        if (level == 1){
            setMProbability(60);
        }else if(level == 2){
            setMProbability(65);
        }else if(level == 3){
            setMProbability(70);
        }

        if (level == 1){
            setMDmg(50);
        }else if(level == 2){
            setMDmg(100);
        }else if(level == 3){
            setMDmg(120);
        }

    }


    @Override
    public void startFight(){
        setHoOh(Level.getLevel());
        warrior.setWarriorHp(Level.getLevel());
        System.out.println("숲 속에서 알을 발견해서 계란후라이를 해먹었습니다!");
        System.out.println("ฅ(՞៸៸> ᗜ < ៸៸՞)ฅ");
        System.out.println();
        System.out.println("한 입에 먹은 순간 상공에서 엄청난 괴음이 들려옵니다!!!");
        System.out.println(" (；◔д◔）       (ʘ言ʘ╬) ");
        System.out.println();
        System.out.println("위험을 지나치면 용사가 아니죠!");
        System.out.println(" ༼ง ◉_◉༽ง        ༼ง ◉_◉༽ง ");
        System.out.println();
        System.out.print("아무키나 입력하고 전투를 시작하세요 : ");
        sc.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(appearance());
        System.out.println();
        System.out.println();
        int hoOhHp = getMHp();
        int warriorHp = warrior.getWarriorHp();
        for (int i = 0; i < 100; i++) {
            System.out.println();
            System.out.println("===sword , bow, garlic===");
            System.out.println();
            System.out.print("공격할 장비를 입력해주세요 : ");
            hoOhHp -= hoOh.warriorEquipmentForHoOh(sc.nextLine());
            if(hoOhHp < 0){
                hoOhHp = 0;
            }
            System.out.println("칠색조 HP : " + hoOhHp);
            if (hoOhHp == 0) {
                System.out.println("칠색조가 쓰러졌습니다!!");
                System.out.println();
                System.out.println();
                break;
            }
            System.out.println();
            System.out.println();
            warriorHp -= hoOh.getHoOhAttack();
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
