package monsterMaker.play;

import monsterMaker.DTO.Level;
import monsterMaker.DTO.WarriorInfo;
import monsterMaker.DTO.monsterDTO.Troll;

import java.util.Scanner;




public class FightTroll{

    Troll troll = new Troll();
    Scanner sc = new Scanner(System.in);
    WarriorInfo warrior = new WarriorInfo();
    private static int retire=1;

    public void startFight(){
        troll.setTroll(Level.getLevel());
        warrior.setWarriorHp(Level.getLevel());
        System.out.println("숲을 지나가다가 엄청나게 큰 발소리가 들립니다.");
        System.out.println(" ૮( ´⁰▱๋⁰` )ა   ૮( ´⁰▱๋⁰` )ა ");
        System.out.println();
        System.out.println("위험을 지나치면 용사가 아니죠!");
        System.out.println("༼ง=ಠ益ಠ=༽ง    ༼ง=ಠ益ಠ=༽ง");
        System.out.println();
        System.out.println("아무키나 입력하고 전투를 시작하세요");
        sc.nextLine();
        System.out.println(troll.appearance());
        int trollHp = troll.getMHp();
        int warriorHp = warrior.getWarriorHp();
        for (int i = 0; i < 100; i++) {
            System.out.println("sword , bow, garlic");
            System.out.print("공격할 장비를 입력해주세요 : ");
            trollHp -= warriorEquipmentForTroll(sc.nextLine());
            System.out.println();
            System.out.println("트롤 HP : " + trollHp);
            if (trollHp <= 0) {
                break;
            }
            System.out.println();
            warriorHp -= getTrollAttack();
            System.out.println(warrior.getWarriorName() + "의 남은 HP : " + warriorHp);
            System.out.println();
            System.out.println();
            if (warriorHp <= 0) {
                FightTroll.retire = 0;
                break;
            }
        }
        System.out.println("숲을 떠납니다.");
    }


    public int warriorEquipmentForTroll (String equipment) {
        int random = (int) (Math.random()*10) + 1;
        int warriorDmg = 0;

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


        }else if (equipment.equals("garlic")){
            warriorDmg = -100;
            System.out.println("마늘을 맛있게 먹습니다.");
        }else{
            warriorDmg = 0;
            System.out.println("잘못 입력하셨습니다.");
        }
        return warriorDmg;
    }

    public int getTrollAttack() {
        int random = (int) (Math.random()*100) + 1;
        int trollDmg = 0;
        int firstTrollDmg = troll.getMDmg();
        if(random <= troll.getMProbability()){
            System.out.println("트롤의 공격에 피격당했습니다.");
            trollDmg = (int)(Math.random()*100)+firstTrollDmg;
        }else {
            System.out.println("옆으로 굴러 회피했습니다.");
            trollDmg = 0;
        }

        return trollDmg;
    }

    public static int getRetire() {
        return retire;
    }
}
