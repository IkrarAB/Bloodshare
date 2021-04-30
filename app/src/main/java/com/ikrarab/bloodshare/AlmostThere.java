/**
 * Tanggal Pengerjaan   : 29 April 2021
 * Deskripsi Pengerjaan : Bloodshare App
 * NIM                  : 10118033
 * Nama                 : Ikrar Anugrah Bastary
 * Kelas                : IF-01/S1/VI
 */

package com.ikrarab.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }

    public void pindah(View view){
        Intent intent2 = new Intent(this,Verify.class);
        startActivity(intent2);
        finish();
    }
}