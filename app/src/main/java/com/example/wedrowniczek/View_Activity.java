package com.example.wedrowniczek;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class View_Activity extends AppCompatActivity {

    String adres2 = "ul. Święty Marcin 80/82\n61-717 Poznań";
    String godz2 = "poniedziałek\tZamknięte\n" + "\t\twtorek\t12:00–20:00\n" +
            "środa\t12:00–20:00\n" +
            "czwartek\t12:00–20:00\n" +
            "piątek\t12:00–20:00\n" +
            "sobota\t12:00–20:00\n" +
            "niedziela\t" + "12:00–20:00";
    String ocena2 = "4.8";
    String opis2 = "Centrum Kultury ZAMEK w Poznaniu to jedna z największych instytucji kultury w kraju. " +
            "Każdego roku odbywa się w nim 2500 wydarzeń, które prezentują i stymulują rozwój najciekawszych zjawisk kultury. " +
            "W przestrzeniach ZAMKU przenikają się i wzajemnie dopełniają sztuki wizualne, teatr, film, muzyka i literatura.";
    int obraz2 = R.drawable.zamek;

   String adres = "ul. Wodna 27\n61-781 Poznań";

   String godz = "poniedziałek\tZamknięte\n" +
           "wtorek\t09:00–16:00\n" +
           "środa\t09:00–16:00\n" +
           "czwartek\t09:00–16:00\n" +
           "piąte\t10:00–17:00\n" +
           "sobota\t10:00–17:00\n" +
           "niedziela\t12:00–16:00";

   String ocena = "4.5";

   String opis = "Posiada cenne zbiory archeologiczne z terenów całej Polski oraz kolekcje pozaeuropejskie."+
           "Placówka udostępnia zwiedzającym wystawy stałe oraz czasowe. " +
           "Zajmuje się także działalnością edukacyjną, ochroną zabytków oraz ochroną dziedzictwa archeologicznego. " +
           "Obecna siedziba muzeum mieści się w Pałacu Górków przy ulicy Wodnej w Poznaniu.";

   int obraz = R.drawable.muzeum_archeologiczne;

   String adres1 = "ul. Wodna 27\n61-781 Poznań";

   String godz1 = "poniedziałek\tZamknięte\n" +
           "wtorek\t09:00–16:00\n" +
           "środa\t09:00–16:00\n" +
           "czwartek\t09:00–16:00\n" +
           "piąte\t10:00–17:00\n" +
           "sobota\t10:00–17:00\n" +
           "niedziela\t12:00–16:00";

   String ocena1 = "4.5";

   String opis1 = "Posiada cenne zbiory archeologiczne z terenów całej Polski oraz kolekcje pozaeuropejskie."+
           "Placówka udostępnia zwiedzającym wystawy stałe oraz czasowe. " +
           "Zajmuje się także działalnością edukacyjną, ochroną zabytków oraz ochroną dziedzictwa archeologicznego. " +
           "Obecna siedziba muzeum mieści się w Pałacu Górków przy ulicy Wodnej w Poznaniu.";

   int obraz1 = R.drawable.muzeum_archeologiczne;

    View_Activity() { }

    public View_Activity(String adres, String godz, String ocena, String opis, int obraz) {

        this.adres = adres;
        this.godz = godz;
        this.ocena = ocena;
        this.opis = opis;
        this.obraz = obraz;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("keyMessage");
        if(msg=="1")
        {

            adres = adres1;
            godz = godz1;
            ocena = ocena1;
            opis = opis1;
            obraz = obraz1;


        }else{


            adres = adres2;
            godz = godz2;
            ocena = ocena2;
            opis = opis2;
            obraz = obraz2;

        }
        // Get the Intent that started this activity and extract the string
        //Intent intent = getIntent();
        String message = "Adres miejsca: \n" + this.adres + "\n\n" + "Godziny otwarcia: " + "\n" + this.godz +
                "\n\nOcena użytkowników: \t" + this.ocena; //"To jest tekst opisujacy obiekt";

        String message2 = "\nOpis miejsca: \n" + this.opis;

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        TextView textView2 = findViewById(R.id.textView3);
        textView2.setText(message2);

        ImageView myImageView = (ImageView) findViewById(R.id.imageView2);
        myImageView.setImageResource(this.obraz);

    }

    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
