package sample.tqi.com.br.myapplication.objetivos;

import java.util.ArrayList;
import java.util.List;

import sample.tqi.com.br.myapplication.R;

/**
 * Created by katia.goncalves on 01/12/2017.
 */

public class ObjetivosPresenter {

    private final ObjetivosView view;


    public ObjetivosPresenter(ObjetivosView view) {
        this.view = view;
    }

    public void getObjetivos() {
        List<String> listAux = new ArrayList<>();
        listAux.add("1.Aprender Melhor Android");
        listAux.add("2.Aprender Melhor Android");
        listAux.add("3.Aprender Melhor Android");
        listAux.add("4.Aprender Melhor Android");
        view.notifyObjectsCreated(listAux);

    }

    public int returnDrawable(int drawable) {
        view.returnDrawable(R.drawable.foto);

        return drawable;

    }
}
