package monsterMaker.DTO;

public class Level {
    private static int level;
    public void levelChoice(String choice){

        if(choice.equals("easy")){
            level = 1;
        }else if(choice.equals("normal")){
            level = 2;
        }else if(choice.equals("hard")){
            level = 3;
        }else{
            System.out.println("제대로 입력해주세요.");
        }

    }

    public static int getLevel() {
        return Level.level;
    }
}
