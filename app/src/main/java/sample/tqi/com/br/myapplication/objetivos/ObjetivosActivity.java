package sample.tqi.com.br.myapplication.objetivos;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.List;

import sample.tqi.com.br.myapplication.R;

public class ObjetivosActivity extends AppCompatActivity implements ObjetivosView {
    ObjetivosPresenter objetivosPresenter;
    ObjetivosAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetivos);


        objetivosPresenter = new ObjetivosPresenter(this);
        objetivosPresenter.getObjetivos();



        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public void notifyObjectsCreated(List<String> listAux) {
        RecyclerView rv = findViewById(R.id.recycler);
        adapter = new ObjetivosAdapter(listAux, this);
        rv.setAdapter(adapter);

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        rv.setLayoutManager(layout);


    }

    @Override
    public void returnDrawable(int drawableID) {
        ContextCompat.getDrawable(getBaseContext(), drawableID);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //Write your logic here
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}

