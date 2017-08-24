import java.net.URI;
import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
			// 1. Ask the user how many cats they have
String numocats = JOptionPane.showInputDialog("How many cats do you have? Also: Fellow cat lady, I welcome you to the depths of the program. greetings.");
			// 2. Convert their answer into an int
int answer = Integer.parseInt(numocats);
			// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if(answer>3) {
	JOptionPane.showMessageDialog(null, "You a cray-cray cat laday :0");
}
			// 4. If they have 3 or less, call the method below to show them a cat video
if(answer<3) {
playVideo("rtsp://r2---sn-a5meknee.googlevideo.com/Cj0LENy73wIaNAlMdgRnHrI0nhMYDSANFC2RHZ9ZMOCoAUIASARgzaXVwbLBn5pZigELaXg2XzFydE1scXMM/28EA3F0B13BAD4DA1A919BF3DA5D1449BAC95D3C.4B2494D6CE39E48919FB86B4FADB697FDC31A825/yt6/1/video.3gp");

			// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
			
		}
if(answer<=0) {
	playVideo("rtsp://r2---sn-a5m7zne7.googlevideo.com/Cj0LENy73wIaNAldMyHhCf2UZBMYDSANFC22H59ZMOCoAUIASARgzaXVwbLBn5pZigELaXg2XzFydE1scXMM/6778D57CCC91F5F2A296E8976F349736DE4ECA58.8812EBA04BAF7B5C4238EBAE75AE92EA3B6E826A/yt6/1/video.3gp");
}
	}
		static void playVideo(String videoURL) {
			try {
				URI uri = new URI(videoURL);
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
