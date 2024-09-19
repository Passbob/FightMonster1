package monsterMaker.DTO.monsterDTO;

public abstract class Monster {
    String MName;
    int MHp;
    int MDmg;
    int MProbability;

    public Monster(){}

    public String appearance() {
        return MName + "이 등장했습니다. {체력=" + MHp +
                ", 데미지=" + MDmg +
                ", 공격확률=" + MProbability +
                '}';

    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public int getMHp() {
        return MHp;
    }

    public void setMHp(int MHp) {
        this.MHp = MHp;
    }

    public int getMDmg() {
        return MDmg;
    }

    public void setMDmg(int MDmg) {
        this.MDmg = MDmg;
    }

    public int getMProbability() {
        return MProbability;
    }

    public void setMProbability(int MProbability) {
        this.MProbability = MProbability;
    }
}
