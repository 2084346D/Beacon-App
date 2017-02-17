package com.example.shoppingbeacon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the view list button */
    public void viewListPage(View view) {
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
    }

    public void viewManageListPage(View view){
        Intent intent = new Intent(this, ManageActivity.class);
        startActivity(intent);
    }

    public void viewLocation(View view){
        Intent intent = new Intent(this, LocationsActivity.class);
        startActivity(intent);
    }

    public void viewRecipe(View view){
        Intent intent = new Intent(this, RecipeActivity.class);
        startActivity(intent);
    }
}
