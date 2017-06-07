package xir2n11.remidiuts.telkomschid.navi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNav1 = (Button) findViewById(R.id.navigasi1);
        Button btnNav2 = (Button) findViewById(R.id.navigasi2);
        Button btnNav3 = (Button) findViewById(R.id.navigasi3);
        Button btnNav4 = (Button) findViewById(R.id.navigasi4);

        btnNav1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, Navigasi1Activity.class);
                startActivity(pindah);
            }
        });

        btnNav2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, Navigasi2Activity.class);
                startActivity(pindah);
            }
        });

        btnNav3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, Navigasi3Activity.class);
                startActivity(pindah);
            }
        });

        btnNav4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, Navigasi4Activity.class);
                startActivity(pindah);
            }
        });
    }

}
