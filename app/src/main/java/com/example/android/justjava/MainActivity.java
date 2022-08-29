package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Этот метод вызывается при нажатии кнопки заказа.
     */
    public void submitOrder(View view) {
        int price = quantity * 5;
        /*display(quantity);
        displayPrice(quantity * 5);*/
        /*String priceMessage = "Free";
        displayMessage(priceMessage);*/
        String message = "Total $ " + price;
        message = message + "\nWoohoo!";
        displayMessage(message);
    }

    /**
     * Этот метод увелеичивает количество в заказе
     */
    public void submitIncrement(View view) {
        quantity++;
        display(quantity);
    }

    /**
     * Этот метод уменьшает количество в заказе
     */
    public void submitDecrement(View view) {
        if (quantity > 1) quantity--;
        display(quantity);
    }

    /**
     * Этот метод отображает заданное значение количества на экране.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * Этот метод отображает заданную цену на экране.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * Этот метод отображает заданный текст на экране.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}