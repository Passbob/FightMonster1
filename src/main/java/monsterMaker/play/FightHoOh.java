package monsterMaker.play;

import monsterMaker.DTO.Level;
import monsterMaker.DTO.WarriorInfo;
import monsterMaker.DTO.monsterDTO.HoOh;

import java.util.Scanner;

public class FightHoOh{

    HoOh hoOh = new HoOh();
    WarriorInfo warrior = new WarriorInfo();
    Scanner sc = new Scanner(System.in);
    private static int retire =1;

    public void startFight(){
        hoOh.setHoOh(Level.getLevel());
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
        System.out.println("아무키나 입력하고 전투를 시작하세요");
        sc.nextLine();
        System.out.println(hoOh.appearance());
        int trollHp = hoOh.getMHp();
        int warriorHp = warrior.getWarriorHp();
        for (int i = 0; i < 100; i++) {
            System.out.println("sword , bow, garlic");
            System.out.print("공격할 장비를 입력해주세요 : ");
            trollHp -= warriorEquipmentForHoOh(sc.nextLine());
            System.out.println();
            System.out.println("칠색조 HP : " + trollHp);
            if (trollHp <= 0) {
                break;
            }
            System.out.println();
            warriorHp -= getHoOhAttack();
            System.out.println(warrior.getWarriorName() + "의 남은 HP : " + warriorHp);
            System.out.println();
            System.out.println();
            if (warriorHp <= 0) {
                FightHoOh.retire = 0;
                break;
            }
        }
        System.out.println("숲을 떠납니다.");
    }




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

    public static int getRetire() {
        return retire;
    }
}
