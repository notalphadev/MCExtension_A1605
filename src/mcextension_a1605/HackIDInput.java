











 * 
 * @author dev_winv_06
 */

public class HackIDInput {

    public static String currentID = "";

    public void OnUI(){
        if (currentID != ""){
            PrintText("[Use numpad to enter, - to clear, + to give]", 2, 10, 0xfaff6e);
            PrintText("Give item: " + currentID, 2, 20, 0xfaff6e);
            try {
                    int a = Integer.parseInt(currentID);
                    if (Block.blocks.length <= a || Block.blocks[a] == null
                    || Item.items[a] == null) {
                            throw new Exception();
                    }
            } catch (Exception e) {
                PrintText("(INVALID)", 2, 30, 0xff0000)
            }
        }
    }

    public void EventKeyboard(){
    if (Keyboard.getEventKey() == 79) {
            currentID += '1';
            System.out.println("Current entered ID: " + currentID);
        }
        else if (Keyboard.getEventKey == 80) {
            currentID += '2';
            System.out.println("Current entered ID: " + currentID)
        }
        else if (Keyboard.getEventKey() == 81) {
            
        }
    }
}