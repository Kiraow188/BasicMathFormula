package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMaths;
    ArrayList<MathsFormula> alFormulaList;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMaths = findViewById(R.id.lvMaths);

        alFormulaList = new ArrayList<>();

        MathsFormula form1 = new MathsFormula("Area of rectangle", "Length x Length", "Area");
        MathsFormula form2 = new MathsFormula("Area of triangle", "(Length of base x Length)/2", "Area");
        MathsFormula form3 = new MathsFormula("Volume of cube", "Length x Length x Length", "Volume");

        alFormulaList.add(form1);
        alFormulaList.add(form2);
        alFormulaList.add(form3);

        caFormula = new CustomAdapter(this, R.layout.maths_rows,alFormulaList);

        lvMaths.setAdapter(caFormula);

    }
}
