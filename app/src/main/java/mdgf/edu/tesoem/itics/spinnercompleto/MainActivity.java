package mdgf.edu.tesoem.itics.spinnercompleto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void añadircolor(View view){
            Intent añadircolor = new Intent(this, Activity_addcolor.class);
            startActivity(añadircolor);


        }
    public void mostrarcolor(View view){
        Intent mostrarcolor = new Intent(this, Activity_mostar.class);
        startActivity(mostrarcolor);
    }

}
