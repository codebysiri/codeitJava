package Ex0203;

public class BlackjackCard extends Card {

    // 자식 클래스의 생성자에서 부모 클래스의 생성자를 먼저 호출해야 한다.
    // 부모 클래스의 인스턴스가 초기화되면서, 자식 클래스의 인스턴스도 생성된다.
    public BlackjackCard(int suitNumber, int rankNumber){
        super(suitNumber, rankNumber);
    }

    public int getValue(){
        if(rankNumber == 1){
            return 11;
        }
        else{
            switch(rankNumber){
                case 10: case 11: case 12: case 13:
                    return 10;
                default:
                    return rankNumber;
            }
        }
    }

    public boolean isAce(){
        return rankNumber == 1;
    }
}