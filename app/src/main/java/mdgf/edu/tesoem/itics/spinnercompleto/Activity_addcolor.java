package mdgf.edu.tesoem.itics.spinnercompleto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_addcolor extends AppCompatActivity {
    EditText nombrecolor;
    Button btnaddcolores;
    Spinner opcion;

    ArrayList<String> addArray = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcolor);
        nombrecolor = (EditText)findViewById(R.id.nombrecolor);
        btnaddcolores = (Button)findViewById(R.id.btnaddcolores);
        opcion=(Spinner)findViewById(R.id.spOpcion);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Activity_addcolor.this, android.R.layout.simple_spinner_dropdown_item, addArray);
        opcion.setAdapter(adapter);
        opcion.setPrompt("Selecciona una opción");


        btnaddcolores.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String getInput = nombrecolor.getText().toString();

                if(addArray.contains(getInput))
                {
                    Toast.makeText(getBaseContext(), "El Elemento ya se había agregado.", Toast.LENGTH_SHORT).show();
                }
                else if(getInput.trim().equals(""))
                {
                    Toast.makeText(getBaseContext(), "Elemento vacío, ingrese texto antes de guardar.", Toast.LENGTH_LONG).show();
                }

                else if(!addArray.contains(getInput))
                {
                    addArray.add(getInput);
                    ((EditText)findViewById(R.id.nombrecolor)).setText("");
                }
            }
        });
        }
}
