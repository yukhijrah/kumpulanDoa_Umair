package decloudius.app.kumpulandoa.model;

import java.io.Serializable;

/**
 * Created by Umair on 11/11/2018.
 */


public class ModelAdzan implements Serializable {

    private String namaSholat;
    private String waktuSholat;

    public ModelAdzan(String namaSholat, String waktuSholat){
        this.namaSholat = namaSholat;
        this.waktuSholat = waktuSholat;
    }

    public String getNamaSholat() {
        return namaSholat;
    }

    public String getWaktuSholat() {
        return waktuSholat;
    }
}


