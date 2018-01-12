package com.example.joegormley.checkers;

/**
 * Created by joegormley on 1/10/18.
 */

enum Color {
    RED, BLACK
}
enum Type {
    PLAIN, KING
}

public class Piece {

    /*************
     * MEMBER(S) *
     *************/
    Piece piece;
    Color color;
    /******************
     * CONSTRUCTOR(S) *
     ******************/
    public Piece(Piece piece, Color color){
        this.piece = piece;
        this.color = color;
    }


    /*************
     * METHOD(S) *
     *************/
	/* Moves a checkers piece from src to des */
    void move(String src, String des){

    }

    public String toString(){
        return color + " " + piece;
    }

}
