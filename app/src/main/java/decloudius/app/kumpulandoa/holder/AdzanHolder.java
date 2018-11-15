package decloudius.app.kumpulandoa.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import decloudius.app.kumpulandoa.R;

/**
 * Created by Umair on 11/11/2018.
 */


public class AdzanHolder extends RecyclerView.ViewHolder {
    public TextView namaSholat;
    public TextView waktuSholat;

    public AdzanHolder(View itemView){
        super(itemView);
        namaSholat = (TextView) itemView.findViewById(R.id.txt_namaSholat);
        waktuSholat= (TextView) itemView.findViewById(R.id.txt_waktuSholat);

    }
}
