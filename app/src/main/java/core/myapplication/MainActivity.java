package core.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import core.mylibrary.MyService;

public class MainActivity extends AppCompatActivity {

    TextView mText;
    public static final String FILTR = "FILR";
    public static final String KYCH = "KYCH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = (TextView) findViewById(R.id.Mtext);
    }

    public void Clikk(View view) {
        startService(new Intent(MainActivity.this, MyService.class));
    }
}
