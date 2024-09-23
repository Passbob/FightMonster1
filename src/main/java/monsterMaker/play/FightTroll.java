package monsterMaker.play;


public class FightTroll{

    Troll troll = new Troll();

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


}
