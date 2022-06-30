






/**
 *
 * @author dev4
 */
public class PlayerMPInvading extends PlayerMPAlt {
    //This is all mostly implemented everywhere else
    //                                - 4


    public static void OnShadowPlayerJoin(ExtWorld world, String name){
        ExtWorld.PrintToChatGlobal(name + " joined");
        world.AddPlayer(name, false);
    }
}