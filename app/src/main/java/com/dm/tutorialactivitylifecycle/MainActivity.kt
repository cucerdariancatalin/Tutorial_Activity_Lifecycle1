package com.dm.tutorialactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Funzione onCreate() che viene eseguita quando si avvia l'Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //con questa riga di codice viene specificato quale layout l'Activity deve impostare
        setContentView(R.layout.activity_main)

        //inserire qui il codice necessario per inizializzare l'Activity
        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show()

    }

    //Funzione onStart() che viene eseguita subito dopo onCreate()
    override fun onStart() {
        super.onStart()

        //inserire qui il codice necessario per impostare i preparativi finali dell'Activity
        //per venire in primo piano e diventare interattiva per l'utente
        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show()

    }

    //Funzione onResume() viene eseguita appena prima che l'Activity inizi a interagire con l'utente
    override fun onResume() {
        super.onResume()

        //inserire qui il codice necessario
        Toast.makeText(this, "onResume()", Toast.LENGTH_SHORT).show()

    }

    //Funzione onPause() viene eseguita dopo onResume() cioè quando l'Activity perde lo stato
    //attivo ed entra in uno stato di pausa
    override fun onPause() {
        super.onPause()

        //inserire qui il codice necessario
        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show()

    }

    //Funzione onStop() viene eseguita quando l'Activity non è più visibile all'utente
    override fun onStop() {
        super.onStop()

        //inserire qui il codice necessario
        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show()

    }

    //Funzione onDestroy() è quella finale che l'Activity riceve prima che venga distrutta
    override fun onDestroy() {
        super.onDestroy()

        //inserire qui il codice necessario
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show()

    }

    //Funzione onRestart() viene eseguita quando un'Activity in stato di arresto sta per riavviarsi
    override fun onRestart() {
        super.onRestart()

        //inserire qui il codice necessario
        Toast.makeText(this, "onRestart()", Toast.LENGTH_SHORT).show()

    }

}
