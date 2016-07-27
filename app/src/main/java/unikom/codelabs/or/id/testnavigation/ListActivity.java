package unikom.codelabs.or.id.testnavigation;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cahyantosetyabudi on 7/4/16.
 */
public class ListActivity {
    public List<String> storyList = new ArrayList<>();
    private int i;

    String[] arrayList = {
        "Makhluk Hitam Dago",
        "Misteri Ruang Dago 610",
        "Wanita Merah R5605",
        "Tamu Tak Diundang Labkom - 2",
        "Kamar Mandi IP Ada Penunggu nya",
        "Ruang Sadaya Kosong Tapi Berisik",
        "Kakek Tua Di Basement Gedung Baru",
        "Gedung Baru Penunggu Baru",
        "Hantu ATM BNI",
        "Pascasarjana Lorong Hitam Menakutkan",
        "Sekjur IF Berhantu",
        "Kamar Mandi Pembawa Maut",
        "Misteri Labkom 5",
        "Miracle Penuh Dengan Kekelaman",
        "Wanita Penunggu Lift",
        "Lorong DKV Sumbernya Kesurupan",
        "Brevet Pembawa Petaka",
        "Robotika, Roket & Penunggunya",
        "R2404 Sepi, Gela, & Mencekam",
        "UNIKOM Dengan Misteri Berdarahnya"
    };

    String[] arrayChapter = {
            "Chapter 1",
            "Chapter 2",
            "Chapter 3",
            "Chapter 4",
            "Chapter 5",
            "Chapter 6",
            "Chapter 7",
            "Chapter 8",
            "Chapter 9",
            "Chapter 10",
            "Chapter 11"
    };

    public void prepareData(){
        for (i=0;i<=2;i++){
            storyList.add(arrayList[i]);
        }
    }
}
