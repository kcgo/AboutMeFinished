package sample.tqi.com.br.myapplication.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import sample.tqi.com.br.myapplication.R;
import sample.tqi.com.br.myapplication.objetivos.ObjetivosActivity;

public class MainActivity extends AppCompatActivity implements MainView {

    MainPresenter mainPresenter;
    TextView tvName;
    TextView tvDescription;
    FloatingActionButton fab ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        initViews();
        requestViewData();
        onCreateView();
    }

    // define este text como textView criado no ficheiro XML
    private final void initViews() {
        tvName = findViewById(R.id.textNome);
        tvDescription = findViewById(R.id.textDesc);
        fab = findViewById(R.id.fab);
    }

    private void requestViewData() {
        mainPresenter.getName();
        mainPresenter.getDescription();
    }

    @Override
    public void returnDescription(int stringID) {
        tvDescription.setText(getString(stringID));
    }

    @Override
    public void returnName(int stringID) {
        tvName.setText(getString(stringID));
    }




    @Override
    public void onCreateView() {

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ObjetivosActivity.class);
                startActivity(intent);
            }
        });

    }
}
