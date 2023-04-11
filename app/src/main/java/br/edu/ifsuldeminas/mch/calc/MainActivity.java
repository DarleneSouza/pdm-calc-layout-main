package br.edu.ifsuldeminas.mch.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ifsuldeminas.mch.calc";
    private Button buttonIgual;
    private TextView textViewResultado;
    private TextView textViewUltimaExpressao;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonAdicao;
    private Button buttonSubtracao;
    private Button buttonMultiplicacao;
    private Button buttonDvisao;
    private Button buttonPorcentagem;
    private Button buttonReseta;
    private Button buttonDeleta;
    private Button buttonVirgula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultadoID);
        textViewUltimaExpressao = findViewById(R.id.textViewUltimaExpressaoID);

        buttonIgual = findViewById(R.id.buttonIgualID);
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculable avaliadorExpressao = null;
                try {
                    String expressao = textViewUltimaExpressao.getText().toString();
                    avaliadorExpressao = new ExpressionBuilder(expressao).build();

                    Double resultado = avaliadorExpressao.calculate();

                    textViewUltimaExpressao.setText(expressao);
                    textViewResultado.setText(resultado.toString());
                } catch (Exception e) {
                    Log.d(TAG, e.getMessage());
                }
            }
        });
        button0 = findViewById(R.id.buttonZeroID);
        BotaoNumerico clickbotao0 = new BotaoNumerico("0", textViewUltimaExpressao);
        button0.setOnClickListener(clickbotao0);

        button1 = findViewById(R.id.buttonUmID);
        BotaoNumerico clickbotao1 = new BotaoNumerico("1", textViewUltimaExpressao);
        button1.setOnClickListener(clickbotao1);

        button2 = findViewById(R.id.buttonDoisID);
        BotaoNumerico clickbotao2 = new BotaoNumerico("2", textViewUltimaExpressao);
        button2.setOnClickListener(clickbotao2);

        button3 = findViewById(R.id.buttonTresID);
        BotaoNumerico clickbotao3 = new BotaoNumerico("3", textViewUltimaExpressao);
        button3.setOnClickListener(clickbotao3);

        button4 = findViewById(R.id.buttonQuatroID);
        BotaoNumerico clickbotao4 = new BotaoNumerico("4", textViewUltimaExpressao);
        button4.setOnClickListener(clickbotao4);

        button5 = findViewById(R.id.buttonCincoID);
        BotaoNumerico clickbotao5 = new BotaoNumerico("5", textViewUltimaExpressao);
        button5.setOnClickListener(clickbotao5);

        button6 = findViewById(R.id.buttonSeisID);
        BotaoNumerico clickbotao6 = new BotaoNumerico("6", textViewUltimaExpressao);
        button6.setOnClickListener(clickbotao6);

        button7 = findViewById(R.id.buttonSeteID);
        BotaoNumerico clickbotao7 = new BotaoNumerico("7", textViewUltimaExpressao);
        button7.setOnClickListener(clickbotao7);

        button8 = findViewById(R.id.buttonOitoID);
        BotaoNumerico clickbotao8 = new BotaoNumerico("8", textViewUltimaExpressao);
        button8.setOnClickListener(clickbotao8);

        button9 = findViewById(R.id.buttonNoveID);
        BotaoNumerico clickbotao9 = new BotaoNumerico("9", textViewUltimaExpressao);
        button9.setOnClickListener(clickbotao9);

        buttonAdicao = findViewById(R.id.buttonSomaID);
        Operacoes clickbotaoSoma = new Operacoes("+", textViewUltimaExpressao);
        buttonAdicao.setOnClickListener(clickbotaoSoma);

        buttonSubtracao = findViewById(R.id.buttonSubtracaoID);
        Operacoes clickbotaoSubtracao = new Operacoes("-", textViewUltimaExpressao);
        buttonSubtracao.setOnClickListener(clickbotaoSubtracao);

        buttonMultiplicacao = findViewById(R.id.buttonMultiplicacaoID);
        Operacoes clickbotaoMultiplicacao = new Operacoes("*", textViewUltimaExpressao);
        buttonMultiplicacao.setOnClickListener(clickbotaoMultiplicacao);

        buttonDvisao = findViewById(R.id.buttonDivisaoID);
        Operacoes clickbotaoDivisao = new Operacoes("/", textViewUltimaExpressao);
        buttonDvisao.setOnClickListener(clickbotaoDivisao);

        buttonPorcentagem = findViewById(R.id.buttonPorcentoID);
        Operacoes clickbotaoPorcentagem = new Operacoes("%", textViewUltimaExpressao);
        buttonPorcentagem.setOnClickListener(clickbotaoPorcentagem);

        buttonVirgula = findViewById(R.id.buttonVirgulaID);
        buttonVirgula.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.setText(textViewUltimaExpressao.getText() + ".");

            }
        });

        buttonReseta = findViewById(R.id.buttonResetID);
        buttonReseta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.setText("");
                textViewResultado.setText("0");
            }
        });

        buttonDeleta = findViewById(R.id.buttonDeleteID);
        buttonDeleta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String exprecao = textViewUltimaExpressao.getText().toString();
                if (exprecao.length() > 0) {
                    exprecao = exprecao.substring(0, exprecao.length() - 1);
                    textViewUltimaExpressao.setText(exprecao);
                }

            }
        });
    }
}