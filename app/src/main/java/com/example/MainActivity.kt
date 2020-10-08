package com.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mult_subtotal()
    }
    fun mult_subtotal(){

        btn_Agregar1.setOnClickListener{
            var precio: Float= (Precio1.text.toString()).toFloat()
            var cantidad: Float =(Cantidad1.text.toString()).toFloat()
            var resultado:String =(precio * cantidad).toString()
            Subtotal1.text=(resultado)
            var precio2: Float= (Precio2.text.toString()).toFloat()
            var cantidad2: Float =(Cantidad2.text.toString()).toFloat()
            var resultado2:String =(precio2 * cantidad2).toString()
            Subtotal2.text=(resultado2)
            var precio3: Float= (Precio3.text.toString()).toFloat()
            var cantidad3: Float =(Cantidad3.text.toString()).toFloat()
            var resultado3:String =(precio3 * cantidad3).toString()
            Subtotal3.text=(resultado3)
            var precio4: Float= (Precio4.text.toString()).toFloat()
            var cantidad4: Float =(Cantidad4.text.toString()).toFloat()
            var resultado4:String =(precio4 * cantidad4).toString()
            Subtotal4.text=(resultado4)
            //Celda 5
            var precio5: Float= (Precio5.text.toString()).toFloat()
            var cantidad5: Float =(Cantidad5.text.toString()).toFloat()
            var resultado5:String =(precio5 * cantidad5).toString()
            Subtotal5.text=(resultado5)
            //Celda 6
            var precio6: Float= (Precio6.text.toString()).toFloat()
            var cantidad6: Float =(Cantidad6.text.toString()).toFloat()
            var resultado6:String =(precio6 * cantidad6).toString()
            Subtotal6.text=(resultado6)
            //Celda 7
            var precio7: Float= (Precio7.text.toString()).toFloat()
            var cantidad7: Float =(Cantidad7.text.toString()).toFloat()
            var resultado7:String =(precio7 * cantidad7).toString()
            Subtotal7.text=(resultado7)
            //Celda 8
            var precio8: Float= (Precio8.text.toString()).toFloat()
            var cantidad8: Float =(Cantidad8.text.toString()).toFloat()
            var resultado8:String =(precio8 * cantidad8).toString()
            Subtotal8.text=(resultado8)


        Calcular.setOnClickListener{

            var total:String =(resultado.toFloat() + resultado2.toFloat() + resultado3.toFloat() + resultado4.toFloat() + resultado5.toFloat() + resultado6.toFloat() + resultado7.toFloat() + resultado8.toFloat()).toString()
            Total.text=(total)
        }
        }






    }


}
