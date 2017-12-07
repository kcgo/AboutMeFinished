package sample.tqi.com.br.myapplication.objetivos;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import sample.tqi.com.br.myapplication.R;

/**
 * Created by tqi_udifab01 on 05/12/17.
 */
public class ObjetivosAdapter extends RecyclerView.Adapter {
    private ObjetivosView view;
    private RecyclerView adapter;
    private ObjetivosPresenter objetivosPresenter;

        private List<String> objetivos;
        private Context context;


        public ObjetivosAdapter(List<String> objetivos, Context context)
        {
            this.context = context;
            this.objetivos = objetivos;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view =  LayoutInflater.from(context)
                    .inflate(R.layout.recycle_layout, parent, false);
            ViewHolderObjetivos holder = new ViewHolderObjetivos (view);
            return  holder;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

            ViewHolderObjetivos holderObjetivos = (ViewHolderObjetivos) holder;
            holderObjetivos.objetivo.setText (objetivos.get (position));

        }

        @Override
        public int getItemCount() {
            return objetivos.size ();
        }

        public  class ViewHolderObjetivos extends RecyclerView.ViewHolder{
            final TextView objetivo;
            public ViewHolderObjetivos(View itemView) {
                super(itemView);
                objetivo = itemView.findViewById( R.id.objetivo);

            }

        }
    }

