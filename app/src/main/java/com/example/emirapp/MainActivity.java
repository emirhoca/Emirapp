package com.example.emirapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.content.Intent;

import org.jetbrains.annotations.NonNls;

public class MainActivity extends AppCompatActivity {
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public boolean onCreateOptionsMenu(Menu menu)
{
    MenuInflater inflater=getMenuInflater();
    inflater.inflate(R.menu.menu,menu);
    return super.onCreateOptionsMenu(menu);

}
public boolean onOptionsItemSelected(@NonNull MenuItem item)
{
    switch(item.getItemId())
    {
        case (R.id.settings):
            Toast.makeText(this,"Settings is clicked",Toast.LENGTH_SHORT).show();
        case R.id.groupChat:
            Toast.makeText(this,"Gropu chat has clicked",Toast.LENGTH_SHORT).show();
        case R.id.logout:
            Toast.makeText(this,"Logouted",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,SingInActivity.class);
            startActivity(intent);
            break;

    }




    return super.onOptionsItemSelected(item);


}




}
