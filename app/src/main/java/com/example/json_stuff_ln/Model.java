package com.example.json_stuff_ln;

import com.google.gson.annotations.SerializedName;

public class Model
{
    @SerializedName( "type" ) private String pikminType;

    @SerializedName( "game" ) private String releaseGame;

    @SerializedName( "description" ) private String description;


    public Model( final String type, final String game, final String description )
    {
        this.pikminType = type;
        this.releaseGame = game;
        this.description = description;
    }


    public String getType() { return pikminType; }
    public String getGame() { return releaseGame; }
    public String getDescription() { return description; }

    public void setType( final String name ) { this.pikminType = name; }
    public void setYear( final String game ) { this.releaseGame = game; }
    public void SetDescription( final String description ) { this.description = description; }
}
