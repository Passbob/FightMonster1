package monsterMaker.DTO;

public class WarriorInfo {
    private static String warriorName;
    private int warriorHp;

    public String getWarriorName() {
        return warriorName;
    }

    public void setWarriorName(String warriorName) {
        this.warriorName = warriorName;
    }

    public int getWarriorHp() {
        return warriorHp;
    }

    public void setWarriorHp(int level) {
        if(level == 1){
            warriorHp = 1200;
        }else if(level == 2){
            warriorHp = 1000;
        }else{
            warriorHp = 700;
        }

    }

}
