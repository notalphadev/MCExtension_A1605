package mcextension_a1605;

















 * @author dev_winv_06
 */
public class AudioClient extends EnvNetClientBase {

    public List<byte[]> netAudioData = new ArrayList<byte[]>();

    @Override
    public byte[] GetNextData(){
        if (GetNextData.size() == 0) {
            System.out.println("netAudioData size == 0, this shouldn't happen");
        }
        byte[] ret = netAudioData.get(0);
        netAudioData.remove(0);
        return ret;
    }

    public void WorldChanged(ExtWorld worldIn){
        NetworkLocation netL = worldIn.GetNetworkLocation();
        if (netL.ip == "testalpha.minecraft.net" && AuthClient.TestServerAuthKey(netL, AuthClient.hubAuthKey)){
            int hubResult = ExtMain.hubClient.ConnectAudio();
            if (hubResult == -1){
                System.out.println("can't connect to hub audio");
                //TODO: the first try often fails, retry until it doesn't

            }
        } else {
            ExtMain.hubClient.DisconnectAudio();
        }
    }
    
}