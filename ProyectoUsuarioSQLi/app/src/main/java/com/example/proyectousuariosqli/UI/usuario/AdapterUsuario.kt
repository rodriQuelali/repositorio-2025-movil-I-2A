package com.example.proyectousuariosqli.UI.usuario

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectousuariosqli.R
import com.example.proyectousuariosqli.model.usuario.Usuario

class AdapterUsuario (
    private var listUsario: List<Usuario>,
    private val onEditar : (Usuario)-> Unit,
    private val onEliminar : (Usuario)->Unit
): RecyclerView.Adapter<AdapterUsuario.UsuarioViewHolder>(){

    class UsuarioViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val txtNombre = itemView.findViewById<TextView>(R.id.tvNombre)
        val txtCorreo = itemView.findViewById<TextView>(R.id.tvCorreo)
        val btnEditar = itemView.findViewById<Button>(R.id.btnEditar)
        val tbnEliminar = itemView.findViewById<Button>(R.id.btnEliminar)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterUsuario.UsuarioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_usuario,parent, false)
        return UsuarioViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterUsuario.UsuarioViewHolder, position: Int) {
        holder.txtNombre.text = listUsario[position].getNombre()
        holder.txtCorreo.text = listUsario[position].getCorreo()

        holder.btnEditar.setOnClickListener { onEditar(listUsario[position]) }
        holder.tbnEliminar.setOnClickListener { onEliminar(listUsario[position]) }
    }

    override fun getItemCount(): Int = listUsario.size

    //actulizar de lista
    fun updateLista(newList: List<Usuario>){
        listUsario = newList
        notifyDataSetChanged()
    }


}