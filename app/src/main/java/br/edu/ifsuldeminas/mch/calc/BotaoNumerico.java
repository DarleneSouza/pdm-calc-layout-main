package br.edu.ifsuldeminas.mch.calc;

import android.view.View;
import android.widget.TextView;

public class BotaoNumerico implements View.OnClickListener {
    private String numero;
    private TextView textViewUltimaExpressao;

    public BotaoNumerico(String numero, TextView textViewUltimaExpressao){
        this.numero = numero;
        this.textViewUltimaExpressao = textViewUltimaExpressao;
    }
    @Override
    public void onClick(View view) {
        textViewUltimaExpressao.setText(textViewUltimaExpressao.getText() + numero);

}


}

