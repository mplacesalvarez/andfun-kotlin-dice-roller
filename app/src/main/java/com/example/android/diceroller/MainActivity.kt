/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    var num=0
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        /* Para realizar la labor de la función random() cree una lista con
        números del uno al seis, utilicé shuffled() para ordenar de forma aleatoria
        la lista y last() para que tomara el último número de la lista */
        val lista: List<Int> = listOf(1, 2, 3, 4, 5, 6)
     val numero= lista.shuffled().last()

        var image=0;
        num=num+1;if(num==7){num=num-6}
         when (numero) {

            1 -> image=R.drawable.dice_1
            2 -> image=R.drawable.dice_2
            3 -> image=R.drawable.dice_3
            4 -> image=R.drawable.dice_4
            5 -> image=R.drawable.dice_5
            else -> image=R.drawable.d
        }
/*Para cambiar una imagen metemos la imagen que queramos en el directorio drawable
y en el fichero MainActivity.kt ponemos su ruta
 */

        diceImage.setImageResource(image)
    }
}
