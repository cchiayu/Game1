package com.tom.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

    }

    private void findViews() {
        findViewById(R.id.arrow_up).setOnClickListener(this);
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        gameView = findViewById(R.id.Game);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.arrow_up:
                Log.d("MainActivity","onClick:UP");
                gameView.setPosY(gameView.getPosY()-120);
                gameView.invalidate();
                break;
            case R.id.arrow_down:
                Log.d("MainActivity","onClick:DOWN");
                //gameView.moveDown();    上下兩種皆可
               gameView.setPosY(gameView.getPosY()+120);
               gameView.invalidate();
                break;
            case R.id.arrow_right:                              //精簡版
                Log.d("MainActivity","onClick:RIGHT");
                gameView.setPosX(gameView.getPosX()+120);
                gameView.invalidate();
                break;
            case R.id.arrow_left:                               //精簡版
                Log.d("MainActivity","onClick:LEFT");
                gameView.setPosX(gameView.getPosX()-120);
                gameView.invalidate();
                break;
        }

    }


}

