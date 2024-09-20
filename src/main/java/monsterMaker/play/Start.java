package monsterMaker.play;

import java.util.Scanner;
import monsterMaker.DTO.WarriorInfo;
import monsterMaker.DTO.Level;
import monsterMaker.DTO.monsterDTO.HoOh;
import monsterMaker.DTO.monsterDTO.Troll;
import monsterMaker.DTO.monsterDTO.Vampire;

public class Start {

    public void startTour(){

        Scanner sc = new Scanner(System.in);
        WarriorInfo warrior = new WarriorInfo();
        Level levelC = new Level();
        Fight fight = new Fight();

        System.out.print("모험을 시작하시려면 아무 키나 입력해주세요 : ");
        sc.nextLine();

        System.out.println();
        System.out.print("용사의 이름을 입력해주세요 : ");
        warrior.setWarriorName(sc.nextLine());
        System.out.println("=======난이도를 입력해주세요======");
        System.out.println("======easy , normal, hard======");
        levelC.levelChoice(sc.nextLine());
        if(Level.getLevel() != 1 && Level.getLevel() != 2 && Level.getLevel() != 3){
            System.out.println("다시 시작해주세요");
        }else {
            System.out.println();
            System.out.println(warrior.getWarriorName() + "은(는) 모험을 떠납니다.");
            System.out.println();
            for (int i = 0; i <= 2; i++) {
                fight.fightStart();
                if(FightHoOh.getRetire() == 0 || FightTroll.getRetire() == 0 || FightVampire.getRetire() == 0){
                    System.out.println("용사가 쓰러졌습니다.");
                    break;
                }
                if (i < 2) {
                    System.out.println();
                    System.out.println("전투가 끝나고 마을에서 휴식합니다.");
                    System.out.println(warrior.getWarriorName() + "의 체력이 모두 회복됩니다.");
                    System.out.println();
                    System.out.println();
                    System.out.print("모험을 다시 시작하시려면 아무 키나 입력해주세요 : ");
                    sc.nextLine();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println(warrior.getWarriorName() + "가 다시 모험을 떠납니다.");
                    System.out.println();
                }
                else {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println(warrior.getWarriorName() + "의 용사시험이 끝났습니다.");
                    System.out.println("더 강한 몬스터가 넘치는 대륙을 향해 " + warrior.getWarriorName() + "(이)가 모험을 준비합니다.");
                    System.out.println("1부 끝");
                    break;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("======End======");





    }

}
