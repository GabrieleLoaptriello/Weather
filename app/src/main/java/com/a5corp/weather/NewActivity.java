package com.a5corp.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardView;
import it.gmariotti.cardslib.library.view.CardViewNative;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Card card = new Card(this);
        CardHeader header = new CardHeader(this , R.layout.carddemo_inner_content);
        card.addCardHeader(header);
        card.setTitle("Hello World");
        CardViewNative cardView = (CardViewNative) findViewById(R.id.cards_activity);
        cardView.setCard(card);
    }
}