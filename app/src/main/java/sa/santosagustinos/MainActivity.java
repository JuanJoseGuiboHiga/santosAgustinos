package sa.santosagustinos;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] santos={"San Agustin","Santa Rita de Cassia","Santa Mónica"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getListView().getContext(),android.R.layout.simple_list_item_1,santos);
        getListView().setAdapter(adapter);
    }
}
