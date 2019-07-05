package adelina;

public class magicDoor {

    public hero[] returnHeroes (){
        hero[] heArr = new hero[4];
        hero a1 = new hero(1,2,3);
        hero a2 = new hero(1,2,3);
        hero a3 = new hero(1,2,3);
        hero a4 = new hero(1,2,3);
        heArr[1] = a1;
        heArr[2] = a2;
        heArr[3] = a3;
        heArr[4] = a4;
        return heArr;


    }

}
