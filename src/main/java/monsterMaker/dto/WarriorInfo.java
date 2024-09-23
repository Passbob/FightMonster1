package monsterMaker.dto;

public class WarriorInfo {
    private static String warriorName;
    private int warriorHp;
    private static int retire =1;


    public WarriorInfo(){}

    public String getWarriorName() {
        return warriorName;
    }

    public void setWarriorName(String warriorName) {
        WarriorInfo.warriorName = warriorName;
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

    public static int getRetire() {
        return retire;
    }

    public static void setRetire(int retire) {
        WarriorInfo.retire = retire;
    }
}
