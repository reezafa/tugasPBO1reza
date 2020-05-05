public class Main {
    public static void main(String[] args) {

        BlackDesert player1= new BlackDesert();
        BlackDesert player2= new BlackDesert();

        player1.familyname = "Nekogami";
        player1.HealthPoints= 2123;
        player1.AttackPower= 151;
        player1.DefensePower= 144;
        player1.Accuracy=122;

        player2.familyname="Lulumaru";
        player2.HealthPoints=2240;
        player2.AttackPower=143;
        player2.DefensePower=146;
        player2.Accuracy=111;

        System.out.println("Round 1 PvP");

        System.out.println("-------------");
        System.out.println(player1.familyname + " with HP " + player1.HealthPoints + ", and AP "+
                player1.AttackPower + " and his DP " + player1.DefensePower);
        System.out.println(player1.familyname + " use buff Demage");
        player1.buffDemage();
        System.out.println("Status updated: "+player1.familyname + " with HP " + player1.HealthPoints + ", and AP "+
                player1.AttackPower + " and his DP " + player1.DefensePower);
        System.out.println("-------------");


        System.out.println("-------------");
        System.out.println(player2.familyname + " with HP " + player2.HealthPoints + ", and AP "+
                player2.AttackPower + " and his DP " + player2.DefensePower);
        System.out.println(player2.familyname + " use buff Evasion");
        player2.buffEvasion();
        System.out.println("Status updated: "+player2.familyname + " with HP " + player2.HealthPoints + ", and AP "+
                player2.AttackPower + " and his DP " + player2.DefensePower);
        System.out.println("-------------");



        System.out.println(player2.familyname+" just attacking "+player1.familyname);
        System.out.println(player1.familyname+" HP now "+(player1.HealthPoints-
                (player2.AttackPower-player1.DefensePower)*player2.Accuracy));

        System.out.println(player1.familyname+" just attacking back to "+player2.familyname);
        System.out.println(player2.familyname+" HP now "+(player2.HealthPoints-
                (player1.AttackPower-player2.DefensePower)*player1.Accuracy));
        System.out.println("-------------");


        System.out.println(player1.familyname + " use buff Demage");
        player1.buffDemage();

        System.out.println("And "+player1.familyname+" just attacking "+player2.familyname);
        System.out.println(player2.familyname+" HP now "+(player2.HealthPoints-
                (player1.AttackPower-player2.DefensePower)*player1.Accuracy));

        player1.kill(player2);
        System.out.println("pemenangnya adalah" +player1.familyname);


    }
}
