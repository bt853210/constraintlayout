package cc.constraintlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size = 30;//sp

    public void bigger(View v){
        textView hello;
        hello = findViewByld(R.id.textView);
        hello.setTextSize(++size) ;
    }
}
