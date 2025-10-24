package com.example.examplofrgament.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examplofrgament.R
import com.example.examplofrgament.model.Usuario

class AdapterUsuario(private val listUsuario: List<Usuario>):
    RecyclerView.Adapter<AdapterUsuario.UserViewHolder>() {

    class UserViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val itemN = itemView.findViewById<TextView>(R.id.tvNombreUsuario)
        val itemC = itemView.findViewById<TextView>(R.id.tvCorreoUsuario)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterUsuario.UserViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.list_usuario, parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterUsuario.UserViewHolder, position: Int) {
        holder.itemN.text =listUsuario[position].setNombre()
        holder.itemC.text =listUsuario[position].setCorreo()
    }

    override fun getItemCount(): Int = listUsuario.size

}