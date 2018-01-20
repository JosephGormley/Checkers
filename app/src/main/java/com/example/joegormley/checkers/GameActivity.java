package com.example.joegormley.checkers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        printBoard();
    }


    /*****************
     * HELPER METHODS *
     *****************/
    void printBoard(){

        int rowNumber = 0;

        for(int i = 0; i < 8; i++){
            System.out.print(rowNumber + " ");
            for(int j = 0; j < 8; j++){
                if(MainActivity.checkersBoard[i][j] == null)
                    System.out.print("  ");
                else
                    System.out.print(MainActivity.checkersBoard[i][j]);
            }
            rowNumber++;
            System.out.println();
        }
        System.out.println("  0 1 2 3 4 5 6 7");
    }


    /***********
     * METHODS *
     ***********/
    void move(String s){
        // Error checks.
        if(s.length() != 4){

        }
    }



}
