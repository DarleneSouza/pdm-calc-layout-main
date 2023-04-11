package br.edu.ifsuldeminas.mch.calc;

import android.view.View;
import android.widget.TextView;

public class Operacoes implements View.OnClickListener{
    private String operacao;
    private TextView textViewUltimaExpressao;

    public Operacoes(String operacao, TextView textViewUltimaExpressao){
        this.operacao = operacao;
        this.textViewUltimaExpressao = textViewUltimaExpressao;
    }

    @Override
    public void onClick(View view) {
        textViewUltimaExpressao.setText(textViewUltimaExpressao.getText() + operacao);
    }
}
