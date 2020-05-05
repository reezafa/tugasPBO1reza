public class BlackDesert {
    String familyname;
    Integer HealthPoints, AttackPower, DefensePower, Accuracy;

    void buffDemage(){
        HealthPoints+=20;
        AttackPower+=17;
        DefensePower+=-15;
        System.out.println("Watahi wa more settrongg!!! Omaewa mooo Shindeiru");
    }

    void buffEvasion(){
        HealthPoints+=70;
        AttackPower+=-6;
        DefensePower+=20;
        System.out.println("Watashi wa more tanky than you, let's battle");
    }


    void kill(BlackDesert blackDesert){
        System.out.println("Congratulations you win");
    }

}
