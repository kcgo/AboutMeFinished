package sample.tqi.com.br.myapplication.main;

import sample.tqi.com.br.myapplication.R;

/**
 * Created by katia.goncalves on 04/12/2017.
 */

public class MainPresenter {

    private MainView mainView;


    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public final void getName() {
        final int stringID = R.string.my_name;
        mainView.returnName(stringID);
    }

    public final void getDescription() {
        final int stringID = R.string.my_description;
        mainView.returnDescription(stringID);

    }


}



