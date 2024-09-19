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
        Troll troll = new Troll();
        Vampire vampire = new Vampire();
        HoOh hoOh = new HoOh();
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
//        warrior.setWarriorHp(level);
//        troll.setTroll(level);
//        vampire.setVampire(level);
//        hoOh.setHoOh(level);
        System.out.println();
        System.out.println(warrior.getWarriorName()  + "은(는) 모험을 떠납니다.");
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i <=3; i++) {
            fight.fightStart();
        }
        System.out.println();
        System.out.println("전투 끝");
        System.out.println("휴식");
        System.out.println("3번 반복");
        System.out.println("모험 끝");
        





    }

}
