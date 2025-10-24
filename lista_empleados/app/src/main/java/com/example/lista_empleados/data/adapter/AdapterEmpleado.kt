package com.example.lista_empleados.data.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lista_empleados.R
import com.example.lista_empleados.data.Empleado

class AdapterEmpleado(private val listEmpleado: List<Empleado>): RecyclerView.Adapter<AdapterEmpleado.EmpleadoViewHolder> (){


    //de clase
    class EmpleadoViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val textViewName: TextView = itemView.findViewById(R.id.tvNombre)
        val textViewS: TextView = itemView.findViewById(R.id.tvSalario)
        val textViewF: TextView = itemView.findViewById(R.id.tvFechaIngreso)
        val textViewQ: TextView = itemView.findViewById(R.id.tvQuinquenio)

    }


    //conexion con mi xml o diseno mi lista de empleados.
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterEmpleado.EmpleadoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_empelado, parent, false)
        return EmpleadoViewHolder(view)
    }


    override fun onBindViewHolder(holder: AdapterEmpleado.EmpleadoViewHolder, position: Int) {
        val name = listEmpleado[position].getNombre()
        val s = listEmpleado[position].getSalario()
        val f = listEmpleado[position].getFechaIngreso()
        val q = listEmpleado[position].getQuinquenio()

        holder.textViewName.text = name
        holder.textViewS.text = s.toString()
        holder.textViewF.text = f
        holder.textViewQ.text = q.toString()
    }

    override fun getItemCount(): Int = listEmpleado.size

}