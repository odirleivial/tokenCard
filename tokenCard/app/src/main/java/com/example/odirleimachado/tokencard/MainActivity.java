package com.example.odirleimachado.tokencard;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static void hideKeyboard(Context context, View editText) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }


    public void exibirCodigo(View view) {

//        declara os obijetos de tela etEntrada e tvCodigo
        EditText etEntrada = (EditText) findViewById(R.id.etEntrada);
        TextView tvCodigo = (TextView) findViewById(R.id.tvCodigo);

//        variável com o valor recuperado do campo de entrada
        int vlrEntrada;

        try{
            vlrEntrada = Integer.parseInt(etEntrada.getText().toString());
        }catch (Exception e){
            vlrEntrada = 0;
            tvCodigo.setText("");
        }

//        Array com os códigos
        String[] listaCodigos = new String[51];
        listaCodigos[0] = "0000";
        listaCodigos[1] = "4164";
        listaCodigos[2] = "0147";
        listaCodigos[3] = "5926";
        listaCodigos[4] = "0945";
        listaCodigos[5] = "2360";
        listaCodigos[6] = "1719";
        listaCodigos[7] = "0525";
        listaCodigos[8] = "3878";
        listaCodigos[9] = "6447";
        listaCodigos[10] = "3864";
        listaCodigos[11] = "6721";
        listaCodigos[12] = "9867";
        listaCodigos[13] = "5318";
        listaCodigos[14] = "4608";
        listaCodigos[15] = "5894";
        listaCodigos[16] = "8072";
        listaCodigos[17] = "9469";
        listaCodigos[18] = "6314";
        listaCodigos[19] = "3872";
        listaCodigos[20] = "3542";
        listaCodigos[21] = "1094";
        listaCodigos[22] = "8879";
        listaCodigos[23] = "8323";
        listaCodigos[24] = "1721";
        listaCodigos[25] = "9900";
        listaCodigos[26] = "4868";
        listaCodigos[27] = "6410";
        listaCodigos[28] = "6429";
        listaCodigos[29] = "5312";
        listaCodigos[30] = "3530";
        listaCodigos[31] = "4153";
        listaCodigos[32] = "6344";
        listaCodigos[33] = "5050";
        listaCodigos[34] = "7431";
        listaCodigos[35] = "8107";
        listaCodigos[36] = "7959";
        listaCodigos[37] = "9937";
        listaCodigos[38] = "3347";
        listaCodigos[39] = "1022";
        listaCodigos[40] = "8496";
        listaCodigos[41] = "1231";
        listaCodigos[42] = "7560";
        listaCodigos[43] = "8038";
        listaCodigos[44] = "5845";
        listaCodigos[45] = "1241";
        listaCodigos[46] = "2913";
        listaCodigos[47] = "2776";
        listaCodigos[48] = "4144";
        listaCodigos[49] = "8977";
        listaCodigos[50] = "1996";

        if (vlrEntrada < 1 || vlrEntrada > 50){
//            sconde teclado
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

//            exibe mensagem de erro
            Toast.makeText(getApplicationContext(), "O número digitado deve ser entre 1 e 50", Toast.LENGTH_SHORT).show();
            etEntrada.setText("");
        } else{
//            insere o número digitado no campo de exibição do código
            tvCodigo.setText(listaCodigos[vlrEntrada]);

//            esconde teclado
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

//            limpa numero digitado
            etEntrada.setText("");
        }
    }



    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
