package br.com.andersonsouza.nubankclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.andersonsouza.nubankclone.databinding.ProdutoItemBinding
import br.com.andersonsouza.nubankclone.model.Produto

class AdapterProduto(private val context: Context, private val listaProdutos: MutableList<Produto>):
    RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProdutoViewHolder(itemLista)
    }

    override fun getItemCount() = listaProdutos.size

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.txtTextoInformativo.text = listaProdutos[position].texto
    }

    inner class ProdutoViewHolder(binding: ProdutoItemBinding): RecyclerView.ViewHolder(binding.root) {
        val txtTextoInformativo = binding.txtTextoInformativo
    }

}