package adelina;

import java.util.Random;

public class boss {
    private int health = 200;
    private int damage = 200;
    private int protectionType = 1;

  public static void changeBossProtection(){
      Random r = new Random();
      int randomNumber = r.nextInt(3) + 1;


  }

  public int getHealth(){
      return health;
  }
  public void setHealth(int health){
      this.health = health;
  }
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public int getProtectionType(){
        return protectionType;
    }
    public void setProtectionType(int protectionType){
        this.protectionType = protectionType;
    }


    }




