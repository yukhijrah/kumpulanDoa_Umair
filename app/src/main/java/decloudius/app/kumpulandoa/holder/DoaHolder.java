package decloudius.app.kumpulandoa.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import decloudius.app.kumpulandoa.R;

/**
 * Created by Umair on 11/11/2018.
 */


public class DoaHolder extends RecyclerView.ViewHolder {
    public TextView namaDoa;
    public TextView arabDoa;
    public TextView latinDoa;
    public TextView artiDoa;

    public DoaHolder(View itemView){
        super(itemView);
        namaDoa = (TextView) itemView.findViewById(R.id.namaDoa);
        arabDoa = (TextView) itemView.findViewById(R.id.arabDoa);
        latinDoa = (TextView) itemView.findViewById(R.id.latinDoa);
        artiDoa = (TextView) itemView.findViewById(R.id.artiDoa);
    }
}
