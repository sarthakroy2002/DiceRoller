/*
 * Author: Sarthak Roy
 */
package com.neolit.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
 * This Activity allows the user to roll and
 * view the result
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice(R.id.DiceView1)
            rollDice(R.id.DiceView2)
        }
    }

    /*
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice(DiceView: Int) {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(DiceView)
        resultTextView.text = diceRoll.toString()
    }
}

/*
 * Dice class which will return
 * random/rolled value
 */
class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
