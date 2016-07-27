package unikom.codelabs.or.id.testnavigation;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class List extends AppCompatActivity {

    public java.util.List<String> storyList = new ArrayList<>();
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        TextView textView = (TextView) findViewById(R.id.list_item);
        textView.setTextColor(Color.parseColor("#3F51B5"));
    }
}
