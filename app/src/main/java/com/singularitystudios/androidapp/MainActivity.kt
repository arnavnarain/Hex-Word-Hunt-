package com.singularitystudios.androidapp

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    // randGen creates a random list of letters to be used in the game
    fun randGen(): MutableList<String> {
        val list = (1 until 21).toMutableList()
        val randomList = mutableListOf<Int>()
        val randomListString = mutableListOf<String>()

        for (i in 0 until 4) {
            val uniqueRand = list.random()
            randomList.add(uniqueRand)
            list.remove(uniqueRand)
        }
        for (i in 0 until 4) {
            if (randomList[i] == 1)
                randomListString.add("Z")

            else if (randomList[i] == 2)
                randomListString.add("B")

            else if (randomList[i] == 3)
                randomListString.add("C")

            else if (randomList[i] == 4)
                randomListString.add("D")

            else if (randomList[i] == 5)
                randomListString.add("Y")

            else if (randomList[i] == 6)
                randomListString.add("F")

            else if (randomList[i] == 7)
                randomListString.add("G")

            else if (randomList[i] == 8)
                randomListString.add("H")

            else if (randomList[i] == 9)
                randomListString.add("X")

            else if (randomList[i] == 10)
                randomListString.add("J")

            else if (randomList[i] == 11)
                randomListString.add("K")

            else if (randomList[i] == 12)
                randomListString.add("L")

            else if (randomList[i] == 13)
                randomListString.add("M")

            else if (randomList[i] == 14)
                randomListString.add("N")

            else if (randomList[i] == 15)
                randomListString.add("W")

            else if (randomList[i] == 16)
                randomListString.add("P")

            else if (randomList[i] == 17)
                randomListString.add("Q")

            else if (randomList[i] == 18)
                randomListString.add("R")

            else if (randomList[i] == 19)
                randomListString.add("S")

            else if (randomList[i] == 20)
                randomListString.add("T")

            else if (randomList[i] == 21)
                randomListString.add("V")

        }
        return randomListString
    }
    fun randMiddleGen(): MutableList<String> {
        val list = (1 until 17).toMutableList()
        val randomList = mutableListOf<Int>()
        val randomListString = mutableListOf<String>()

        for (i in 0 until 1) {
            val uniqueRand = list.random()
            randomList.add(uniqueRand)
            list.remove(uniqueRand)
        }
        for (i in 0 until 1) {
            if (randomList[i] == 1)
                randomListString.add("B")

            else if (randomList[i] == 2)
                randomListString.add("C")

            else if (randomList[i] == 3)
                randomListString.add("D")

            else if (randomList[i] == 4)
                randomListString.add("F")

            else if (randomList[i] == 5)
                randomListString.add("G")

            else if (randomList[i] == 6)
                randomListString.add("H")

            else if (randomList[i] == 7)
                randomListString.add("J")

            else if (randomList[i] == 8)
                randomListString.add("K")

            else if (randomList[i] == 9)
                randomListString.add("L")

            else if (randomList[i] == 10)
                randomListString.add("M")

            else if (randomList[i] == 11)
                randomListString.add("N")

            else if (randomList[i] == 12)
                randomListString.add("W")

            else if (randomList[i] == 13)
                randomListString.add("P")

            else if (randomList[i] == 14)
                randomListString.add("R")

            else if (randomList[i] == 15)
                randomListString.add("S")

            else if (randomList[i] == 16)
                randomListString.add("T")

            else if (randomList[i] == 17)
                randomListString.add("V")
        }
        return randomListString
    }

    // creates a random list of 3 vowels for the game
    fun randGenVowel(): MutableList<String> {
        val list = (1 until 5).toMutableList()
        val randomList = mutableListOf<Int>()
        val randomListString = mutableListOf<String>()

        for (i in 0 until 3) {
            val uniqueRand = list.random()
            randomList.add(uniqueRand)
            list.remove(uniqueRand)
        }
        for (i in 0 until 3) {
            if (randomList[i] == 1)
                randomListString.add("A")
            else if (randomList[i] == 2)
                randomListString.add("E")
            else if (randomList[i] == 3)
                randomListString.add("I")
            else if (randomList[i] == 4)
                randomListString.add("O")
            else
                randomListString.add("U")
        }
        return randomListString

    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_view_main: TextView = findViewById(R.id.txt_view_main)
        txt_view_main.text = ""
        val enteredWords = mutableListOf<String>()
        var totalPoints = 0

        val btnm = findViewById<Button>(R.id.btntm)
        val btnt = findViewById<Button>(R.id.btnt)
        val btntl = findViewById<Button>(R.id.btntl)
        val btntr = findViewById<Button>(R.id.btntr)
        val btnbl = findViewById<Button>(R.id.btnbl)
        val btnbr = findViewById<Button>(R.id.btnbr)
        val btnb = findViewById<Button>(R.id.btnb)
        val btnEnter = findViewById<Button>(R.id.button_enter)
        val btnRefresh = findViewById<Button>(R.id.button_refresh)

        val btnRemove = findViewById<Button>(R.id.button_remove)

        val textView1: TextView = findViewById(R.id.txt_view1)
        val textView2: TextView = findViewById(R.id.txt_view2)
        val textView3 = findViewById<TextView>(R.id.txt_view3)


        val textView4 = findViewById<TextView>(R.id.txt_view4)
        val textView5 = findViewById<TextView>(R.id.txt_view5)
        val textView6 = findViewById<TextView>(R.id.txt_view6)
        val textView7: TextView = findViewById(R.id.txt_view7)

        val textViewPoints = findViewById<TextView>(R.id.txt_view_points)
        val textViewTimer = findViewById<TextView>(R.id.txt_view_timer)


        fun showEndDialog(totalPoints : Int) {
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder.setTitle("Game Over!")
            val message = "You earned " + totalPoints.toString() + " points in 60 seconds!"
            builder.setMessage(message)
            builder.setIcon(R.drawable.app_icon)

            builder.setNeutralButton("Restart!", DialogInterface.OnClickListener {
                    dialog, which ->
                finish();
                overridePendingTransition(0, 0)
                startActivity(getIntent())
                overridePendingTransition(0, 0)
            })
            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()

        }

        val timer: CountDownTimer
        timer = object:CountDownTimer(60000,1000) {
            override fun onTick(millisUntilFinished: Long) {
                val timeInSeconds = millisUntilFinished / 1000

                if (timeInSeconds.toInt() == 1) {
                        textViewTimer.text = timeInSeconds.toString() + " second"
                }
                else {
                        textViewTimer.text = timeInSeconds.toString() + " seconds"
                }
            }
            override fun onFinish() {
                showEndDialog(totalPoints)
            }
        }

        fun showSimpleDialog() {

            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder.setTitle("Word Game")
            builder.setMessage("Make as many words as you can with the required letter in 60 seconds!")
            builder.setIcon(R.drawable.app_icon)

            builder.setNeutralButton("Play", DialogInterface.OnClickListener {
                    dialog, which ->
                timer.start()
                dialog.dismiss()

            })
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCanceledOnTouchOutside(false);
            alertDialog.show()
        }

        showSimpleDialog()

        val fileText: List<String> = applicationContext.assets.open("words.txt").bufferedReader().use {
            it.readLines()
        }

        val list = randGen()
        val listVowel = randGenVowel()
        val listmiddle = randMiddleGen()
        val g = listmiddle[0]
        while (g in list) {
            val list = randGen()
        }
        val a = listVowel[0]
        val b = listVowel[1]
        val c = listVowel[2]
        val d = list[0]
        val e = list[1]
        val f = list[2]


        textView1.text = a
        textView2.text = b
        textView3.text = c
        textView4.text = d
        textView5.text = e
        textView6.text = f
        textView7.text = g


        fun isAWord(): Boolean {
            val str1 = txt_view_main.text.toString()
            if (str1.contains(g)) {
                for (element in fileText) {
                    if (element.equals(str1.lowercase()))
                        return true
                }
                return false
            }
            return false
        }

        btnm.setOnClickListener {
            if (txt_view_main.text.toString().length < 15) {
                val str1 = txt_view_main.text.toString() + textView7.text.toString()
                txt_view_main.text = str1
            }

        }
        btnt.setOnClickListener {
            if (txt_view_main.text.toString().length < 15) {
                val str1 = txt_view_main.text.toString() + textView1.text.toString()
                txt_view_main.text = str1
            }

        }
        btntl.setOnClickListener {
            if (txt_view_main.text.toString().length < 15) {
                val str1 = txt_view_main.text.toString() + textView5.text.toString()
                txt_view_main.text = str1
            }

        }
        btntr.setOnClickListener {
            if (txt_view_main.text.toString().length < 15) {
                val str1 = txt_view_main.text.toString() + textView4.text.toString()
                txt_view_main.text = str1
            }

        }
        btnbl.setOnClickListener {
            if (txt_view_main.text.toString().length < 15) {
                val str1 = txt_view_main.text.toString() + textView3.text.toString()
                txt_view_main.text = str1
            }

        }
        btnb.setOnClickListener {
            if (txt_view_main.text.toString().length < 15) {
                val str1 = txt_view_main.text.toString() + textView6.text.toString()
                txt_view_main.text = str1
            }

        }
        btnbr.setOnClickListener {
            if (txt_view_main.text.toString().length < 15) {
                val str1 = txt_view_main.text.toString() + textView2.text.toString()
                txt_view_main.text = str1
            }

        }
        btnRemove.setOnClickListener {
            val str1 = txt_view_main.text.toString()
            if (str1.isNotEmpty())
                txt_view_main.text = str1.subSequence(0,str1.length - 1)
        }

        fun addPoints() {
            totalPoints += txt_view_main.text.toString().length
            textViewPoints.text = "Points: " + totalPoints.toString()
        }

        btnEnter.setOnClickListener {

            var str1 = txt_view_main.text.toString()

            if ((isAWord() && (str1 !in enteredWords))) {
                    enteredWords.add(txt_view_main.text.toString())
                    addPoints()
                    txt_view_main.text = ""

                    val arrayAdapter: ArrayAdapter<*>
                    //val enteredWordsArray = arrayOf(enteredWords)
                    val enteredWordsArray = enteredWords.toTypedArray()
                    var mListView = findViewById<ListView>(R.id.listview)
                    arrayAdapter = ArrayAdapter(
                        this,
                        android.R.layout.simple_list_item_1, enteredWordsArray
                    )
                    mListView.adapter = arrayAdapter
                }
            }

        fun refresh () {
            finish();
            overridePendingTransition(0, 0)
            startActivity(getIntent())
            overridePendingTransition(0, 0)
        }

        btnRefresh.setOnClickListener {
            refresh()
        }
    }
}
